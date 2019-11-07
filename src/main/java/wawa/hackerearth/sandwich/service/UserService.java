package wawa.hackerearth.sandwich.service;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wawa.hackerearth.sandwich.dao.UsersRepository;
import wawa.hackerearth.sandwich.model.entity.User;
import wawa.hackerearth.sandwich.model.vo.UserRequest;
import wawa.hackerearth.sandwich.model.vo.UserResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UsersRepository userRepository;


    public List<User> getUsers() {
        List<User> list = new ArrayList<>();
        try {
            list = userRepository.findAll();
        } catch (Exception e) {

            String msg = "Error while getting Data in UserService.getUsers";
            LOGGER.error(msg, e);
        }
        return list;
    }

    public UserResponse save(UserRequest request) {
        LOGGER.info("in UserService.saveDataCollections:save");
        User user;//= new DataCollections();
        User dbResponse;// = null;
        UserResponse userResponse = null;
        try {

            user = modelMapper.map(request, User.class);
            dbResponse = userRepository.save(user);

            userResponse = modelMapper.map(dbResponse, UserResponse.class);

        } catch (Exception e) {

            String msg = "Error while persisting Data in UserService.save user";
            LOGGER.error(msg, e);
        }

        LOGGER.info(" UserService.save user:end");
        return userResponse;
    }

}
