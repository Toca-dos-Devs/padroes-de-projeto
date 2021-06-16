package com.tocadosdevs.designpatterns.factoryMethod.classes;

import com.tocadosdevs.designpatterns.factoryMethod.interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void userNotifier() {
        System.out.println("Enviando notificação push ... ");
    }
}
