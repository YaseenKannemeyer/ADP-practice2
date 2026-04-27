package za.ac.cput.adppractice2.factory;

import za.ac.cput.adppractice2.domain.InStoreOrder;

import java.sql.Date;

public class InStoreOrderFactory {
    public static InStoreOrder createInStoreOrder(String orderId, Date date, String status, double immediatePayment, String cashierName){

        return (InStoreOrder) new InStoreOrder.Builder()
                .setOrderId(orderId)
                .setDate(date)
                .setStatus(status)
                .setImmediatePayment(immediatePayment)
                .setCashierName(cashierName)
                .build();
    }
}
