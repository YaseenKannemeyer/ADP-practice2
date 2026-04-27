package za.ac.cput.adppractice2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="order_items")
public class OrderItem {

    @Id
    private String orderItemId;

    private int quantity;
    private double subTotal;

    protected OrderItem() {}

    private OrderItem(Builder builder){
        this.orderItemId = builder.orderItemId;
        this.quantity =builder.quantity;
        this.subTotal = builder.subTotal;

    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public static class Builder{
        private String orderItemId;

        private int quantity;
        private double subTotal;

        public Builder setOrderItemId(String orderItemId){
            this.orderItemId = orderItemId;
            return this;
        }

        public Builder setQuantity (int quantity){
            this.quantity =quantity;
            return this;
        }

        public Builder setSubTotal(double subTotal){
            this.subTotal =subTotal;
            return this;
        }

        public OrderItem build(){
            return new OrderItem(this);
        }

    }
}
