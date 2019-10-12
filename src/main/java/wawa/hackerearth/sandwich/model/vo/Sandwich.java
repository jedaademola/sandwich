package wawa.hackerearth.sandwich.model.vo;

import java.io.Serializable;
import java.util.List;

public class Sandwich implements Serializable {
    private static final long serialVersionUID = 1L;
    List<OrderItems> orderItems;

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }
}
