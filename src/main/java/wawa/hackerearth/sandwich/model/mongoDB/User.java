package wawa.hackerearth.sandwich.model.mongoDB;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.*;

@Document
public class User {

    @Id
    private String userId;
    private String name;
    private Date creationDate = new Date();
    private Map<String, String> userSettings = new HashMap<>();

    @DBRef(db = "address")
    private List<Address> addresses = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Map<String, String> getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(Map<String, String> userSettings) {
        this.userSettings = userSettings;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
