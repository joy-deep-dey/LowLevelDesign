package com.joy.design_patterns.facade;

import com.joy.design_patterns.facade.service.DeliveryService;
import com.joy.design_patterns.facade.service.NotificationService;
import com.joy.design_patterns.facade.service.PaymentService;
import com.joy.design_patterns.facade.service.Restaurant;

public class FoodDeliveryFacade {
    private Restaurant restaurant;
    private PaymentService paymentService;
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public FoodDeliveryFacade() {
        restaurant = new Restaurant();
        paymentService = new PaymentService();
        deliveryService = new DeliveryService();
        notificationService = new NotificationService();
    }

    public void placeOrder() {

        paymentService.processPayment();

        restaurant.prepareFood();

        deliveryService.assignDeliveryBoy();

        notificationService.sendNotification();
    }
}
