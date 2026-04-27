package za.ac.cput.adppractice2.factory;

import za.ac.cput.adppractice2.domain.OrderItem;

public class OrderItemFactory {
    public static OrderItem createOrderItem(String orderItemId, int quantity, double subTotal ){
        return new OrderItem.Builder()
                .setOrderItemId(orderItemId)
                .setQuantity(quantity)
                .setSubTotal(subTotal)
                .build();
    }
}
