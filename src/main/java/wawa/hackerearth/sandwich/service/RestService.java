package wawa.hackerearth.sandwich.service;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import wawa.hackerearth.sandwich.config.RestTemplateConfig;
import wawa.hackerearth.sandwich.model.vo.People;
import wawa.hackerearth.sandwich.model.vo.Result;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestService.class);
    //protected RestTemplate restTemplate;
    protected HttpHeaders httpHeaders;
    @Autowired
    private RestTemplateConfig restTemplateFactory;

    @PostConstruct
    public void init() {
        //this.restTemplate = new RestTemplate();
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        this.httpHeaders.set("Accept", "application/json");
        this.setErrorHandler();
    }

    private void setErrorHandler() {
        this.restTemplateFactory.restTemplate().setErrorHandler(new DefaultResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {
                LOGGER.error("Response Status Code: " + response.getRawStatusCode());
                LOGGER.error("Response Status Text: " + response.getStatusText());
                if (response.getRawStatusCode() == 404) {//usually there is no response to parse in this case
                    LOGGER.error("Response Body: " + new String(getResponseBody(response)));
                    return true;
                }
                return false; //we want to be able to parse the error response
            }
        });
    }

    private byte[] getResponseBody(ClientHttpResponse response) {

        try {
            InputStream responseBody = response.getBody();
            if (responseBody != null) {
                return FileCopyUtils.copyToByteArray(responseBody);
            }
        } catch (IOException ex) {
            // ignore
        }
        return new byte[0];
    }


    public <T> ResponseEntity<T> invokeClient(String url, HttpMethod method, HttpEntity<?> httpRequest,
                                              Class<T> object) {
        return this.restTemplateFactory.restTemplate().exchange(url, method, httpRequest, object);
    }


    public List<Result> peopleList() {

        HttpEntity<?> httpRequest = new HttpEntity<>(null, this.httpHeaders);
        ResponseEntity<?> responseTemp = null;
        List<Result> resultLists = new ArrayList<>();

        People response = null;

        try {
            String url = "https://swapi.co/api/" + "/people"; //TODO PUT in properties
            LOGGER.error("Server Result calling  URL: {}", url);
            responseTemp = invokeClient(url, HttpMethod.GET, httpRequest, String.class);

            if (responseTemp.getStatusCode().is2xxSuccessful()) {
                ObjectMapper mapper = new ObjectMapper();
                response = mapper.readValue(responseTemp.getBody().toString(), People.class);

                resultLists.addAll(
                        response.getResults().stream()
                                .filter(r -> r.getHeight() > 172)
                                .collect(Collectors.toList()));

                while (null != response.getNext()) {
                    responseTemp = invokeClient(response.getNext(), HttpMethod.GET, httpRequest, String.class);
                    response = mapper.readValue(responseTemp.getBody().toString(), People.class);

                    resultLists.addAll(response.getResults().stream()
                            .filter(r -> r.getHeight() > 172)
                            .collect(Collectors.toList()));
                }
            } else {
                //Handle other Response Codes
                //response = handleOtherResponseCodes(responseTemp);
            }
        } catch (ResourceAccessException e) {
            String msg = e.getMessage();
            LOGGER.error(msg, e);
            //throw new RestException(HBEConstants.HPF_MS_BS_003, e.getMessage());
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultLists;
    }
}
