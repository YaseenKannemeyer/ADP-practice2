package za.ac.cput.adppractice2.factory;

import za.ac.cput.adppractice2.domain.OnlineOrder;

import java.sql.Date;

public class OnlineOrderFactory {
    public static OnlineOrder createOnlineOrder(String orderId, Date date, String status, String deliveryAddress, String shippingCode, double digitalPayment) {
        return (OnlineOrder) new OnlineOrder.Builder()
                .setOrderId(orderId)
                .setDate(date)
                .setStatus(status)
                .setDeliveryAddress(deliveryAddress)
                .setShippingCode(shippingCode)
                .setDigitalPayment(digitalPayment)
                .build();


    }
}
