package za.ac.cput.adppractice2.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import za.ac.cput.adppractice2.util.Helper;


@Entity
@Table(name = "in_store_orders")
@PrimaryKeyJoinColumn(name = "order_id")

public class InStoreOrder extends Order{
    private double immediatePayment;
    private String cashierName;

    protected InStoreOrder() {}

    private InStoreOrder(Builder builder) {
        super(builder);
        this.immediatePayment = builder.immediatePayment;
        this.cashierName = builder.cashierName;
    }

    public double getImmediatePayment() {
        return immediatePayment;
    }

    public String getCashierName() {
        return cashierName;
    }

    public static  class Builder extends Order.Builder<Builder>{
        private double immediatePayment;
        private String cashierName;

        public Builder setImmediatePayment(double immediatePayment) {
            this.immediatePayment = immediatePayment;
            return this;
        }

        public Builder setCashierName(String cashierName) {
            this.cashierName = cashierName;
            return this;
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Order build() {
            if (immediatePayment <= 0 || Helper.isNullOrEmpty(cashierName) ) {
                return null;
            }return new InStoreOrder(this);
        }
    }
}
