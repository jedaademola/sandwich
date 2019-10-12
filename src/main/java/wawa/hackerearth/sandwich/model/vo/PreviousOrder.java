package wawa.hackerearth.sandwich.model.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class PreviousOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long orderId;
    private Date orderDate;
    List<OrderItems> orderItems;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }
}
