package wawa.hackerearth.sandwich.model.entity;


import wawa.hackerearth.sandwich.model.vo.FavouritesGroups;
import wawa.hackerearth.sandwich.model.vo.PreviousOrder;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Profile")
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String customerId;
    private String firstName;
    private String lastName;
    
    @Transient
    private transient FavouritesGroups favouritesGroups;
    
    @Transient
    private transient PreviousOrder previousOrders;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FavouritesGroups getFavouritesGroups() {
        return favouritesGroups;
    }

    public void setFavouritesGroups(FavouritesGroups favouritesGroups) {
        this.favouritesGroups = favouritesGroups;
    }

    public PreviousOrder getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(PreviousOrder previousOrders) {
        this.previousOrders = previousOrders;
    }
}
