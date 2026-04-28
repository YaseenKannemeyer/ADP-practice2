package za.ac.cput.adppractice2.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import za.ac.cput.adppractice2.util.Helper;

@Entity
@Table(name = "online_orders")
@PrimaryKeyJoinColumn(name = "order_id")

public class OnlineOrder extends Order {
    private String deliveryAddress;
    private String shippingCode;
    private double digitalPayment;

    protected OnlineOrder() {}
    
    private OnlineOrder(Builder builder) {
        super(builder);
        this.deliveryAddress = builder.deliveryAddress;
        this.shippingCode = builder.shippingCode;
        this.digitalPayment = builder.digitalPayment;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public double getDigitalPayment() {
        return digitalPayment;
    }
    
    public static class Builder extends Order.Builder<Builder> {
        private String deliveryAddress;
        private String shippingCode;
        private double digitalPayment;

        public Builder setDigitalPayment(double digitalPayment) {
            this.digitalPayment = digitalPayment;
            return this;
        }

        public Builder setShippingCode(String shippingCode) {
            this.shippingCode = shippingCode;
            return this;
        }

        public Builder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public OnlineOrder build() {
            validateBase();

            if (Helper.isNullOrEmpty(deliveryAddress)) {
                throw new IllegalArgumentException("Delivery address is required");
            }

            if (Helper.isNullOrEmpty(shippingCode)) {
                throw new IllegalArgumentException("Shipping code is required");
            }

            if (digitalPayment <= 0) {
                throw new IllegalArgumentException("Digital payment must be greater than 0");
            }

            return new OnlineOrder(this);
        }
    }
}
