package wawa.hackerearth.sandwich.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Customer profile.")
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;

    private CustomerRequest customer;
    private FavouritesGroups favouritesGroups;
    private PreviousOrder previousOrders;

    public CustomerRequest getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerRequest customer) {
        this.customer = customer;
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
