package wawa.hackerearth.sandwich.dao.mongoDbDao;

import wawa.hackerearth.sandwich.model.mongoDB.Address;
import wawa.hackerearth.sandwich.model.mongoDB.User;

import java.util.List;

public interface UserDAL {

    List<User> getAllUsers();

    User getUserById(String userId);

    User addNewUser(User user);

    Address addUserAddress(Address address);

    Object getAllUserSettings(String userId);

    String getUserSetting(String userId, String key);

    String addUserSetting(String userId, String key, String value);
}
