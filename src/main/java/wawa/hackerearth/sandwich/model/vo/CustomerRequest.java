package wawa.hackerearth.sandwich.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String customerId;
    private String firstName;
    private String lastName;
    
    private Long paymentMode;
    private Long deliveryMode;
    
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

	public Long getId() {
		return id;
	}

	 @JsonIgnore
	public void setId(Long id) {
		this.id = id;
	}

	public Long getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Long paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Long getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(Long deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	@Override
	public String toString() {
		return "CustomerRequest [id=" + id + ", customerId=" + customerId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", paymentMode=" + paymentMode + ", deliveryMode=" + deliveryMode + "]";
	}
    
    
}
