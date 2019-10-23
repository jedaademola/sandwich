package wawa.hackerearth.sandwich.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wawa.hackerearth.sandwich.model.vo.People;
import wawa.hackerearth.sandwich.model.vo.Result;
import wawa.hackerearth.sandwich.service.RestService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@Api("Endpoint for PeopleController")
public class PeopleController {

    @Autowired
    private RestService restService;

    @GetMapping(path = "/people")
    @ApiOperation("Display people")
    public List<Result> peopleList() {
        return restService.peopleList();
    }


}
