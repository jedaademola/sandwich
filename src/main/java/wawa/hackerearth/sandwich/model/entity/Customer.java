package wawa.hackerearth.sandwich.model.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerId;
    private String firstName;
    private String lastName;
    
    private Long paymentMode;
    private Long deliveryMode;
    
    @OneToMany(mappedBy="customer")
    private List<OrderItems>  orderItems;

    public  Customer (){

    }
    
    public List<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

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
    
}
