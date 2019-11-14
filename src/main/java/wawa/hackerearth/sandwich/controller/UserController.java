package wawa.hackerearth.sandwich.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wawa.hackerearth.sandwich.dao.mongoDbDao.UserDAL;
import wawa.hackerearth.sandwich.dao.mongoDbDao.UserRepository;
import wawa.hackerearth.sandwich.model.mongoDB.User;
import wawa.hackerearth.sandwich.model.vo.UserRequest;
import wawa.hackerearth.sandwich.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
@Api("Endpoint for UserController")
public class UserController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    private final UserDAL userDAL;

    @Autowired
    private UserService userService;

    public UserController(UserRepository userRepository, UserDAL userDAL) {
        this.userRepository = userRepository;
        this.userDAL = userDAL;
    }

    @GetMapping("/users")
    public List<wawa.hackerearth.sandwich.model.entity.User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public wawa.hackerearth.sandwich.model.entity.User getUserById(@PathVariable("id") Long userId) {
        return userService.getUserById(userId);
    }
    @PostMapping("/users")
    public void addUser(@RequestBody UserRequest user) {

        userService.save(user);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody UserRequest user) {

        userService.save(user);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User addNewUsers(@RequestBody User user) {
        LOG.info("Saving user.");
        userDAL.addUserAddress(user.getAddresses().get(0));
        return userRepository.save(user);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        LOG.info("Getting all users.");
        return userRepository.findAll();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable String userId) {
        LOG.info("Getting user with ID: {}.", userId);
        //return userRepository.findById(userId).get();
        return userDAL.getUserById(userId);
    }

    // @RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
    // public Object getAllUserSettings(@PathVariable String userId) {
    // User user = userRepository.findOne(userId);
    // if (user != null) {
    // return user.getUserSettings();
    // } else {
    // return "User not found.";
    // }
    // }

    @RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
    public Object getAllUserSettings(@PathVariable String userId) {
        User user = userDAL.getUserById(userId);
        if (user != null) {
            return userDAL.getAllUserSettings(userId);
        } else {
            return "User not found.";
        }
    }

    // @RequestMapping(value = "/settings/{userId}/{key}", method =
    // RequestMethod.GET)
    // public String getUserSetting(@PathVariable String userId, @PathVariable
    // String key) {
    // //User user = userRepository.findOne(userId);
    // String setting = userDAL.getUserSetting(userId, key);
    // LOG.info("Setting = "+setting);
    // if (setting != null) {
    // return setting;
    // } else {
    // return "Setting not found.";
    // }
    // }

    @RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
    public String getUserSetting(@PathVariable String userId, @PathVariable String key) {
        return userDAL.getUserSetting(userId, key);
    }

    @RequestMapping(value = "/settings/{userId}/{key}/{value}", method = RequestMethod.GET)
    public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
        User user = userDAL.getUserById(userId);
        if (user != null) {
            user.getUserSettings().put(key, value);
            userRepository.save(user);
            return "Key added";
        } else {
            return "User not found.";
        }
    }
}
