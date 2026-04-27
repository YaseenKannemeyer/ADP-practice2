package za.ac.cput.adppractice2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import za.ac.cput.adppractice2.util.Helper;

@Entity
@Table(name = "online_orders")
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
        public Order build() {
            if (Helper.isNullOrEmpty(deliveryAddress) || Helper.isNullOrEmpty(shippingCode) || digitalPayment <= 0 ) {
                return null;
            }

            return new OnlineOrder(this);
        }
    }
}
