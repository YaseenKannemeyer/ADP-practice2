package za.ac.cput.adppractice2.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "orders")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "order_type", discriminatorType = DiscriminatorType.STRING)

public abstract class Order {
    @Id
    private String OrderId;

    private Date date;
    private String status;
    
    protected Order() {}

    public Order(Builder<?> builder) {
        this.OrderId = builder.OrderId;
        this.date = builder.date;
        this.status = builder.status;
    }

    public String getOrderId() {
        return OrderId;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
    
    public static abstract class Builder<T extends Builder<T>>{
        private String OrderId;

        private Date date;
        private String status;

        public T setOrderId(String orderId) {
            OrderId = orderId;
            return self();
        }

        public T setDate(Date date) {
            this.date = date;
            return self();
        }

        public T setStatus(String status) {
            this.status = status;
            return self();
        }
        protected abstract T self();

        public abstract Order build();
    }
}
