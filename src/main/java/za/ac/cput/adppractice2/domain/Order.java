package za.ac.cput.adppractice2.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "orders")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Order {
    @Id
    private String orderId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String status;
    
    protected Order() {}

    public Order(Builder<?> builder) {
        this.orderId = builder.OrderId;
        this.date = builder.date;
        this.status = builder.status;
    }

    public String getOrderId() {
        return orderId;
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

        protected void validateBase() {
            if (OrderId == null || OrderId.isEmpty()) {
                throw new IllegalArgumentException("orderId is required");
            }

            if (date == null) {
                throw new IllegalArgumentException("Date is required");
            }

            if (status == null || status.isEmpty()) {
                throw new IllegalArgumentException("Status is required");
            }
        }
    }
}
