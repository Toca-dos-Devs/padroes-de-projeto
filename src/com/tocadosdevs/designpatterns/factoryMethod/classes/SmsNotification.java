package com.tocadosdevs.designpatterns.factoryMethod.classes;

import com.tocadosdevs.designpatterns.factoryMethod.interfaces.Notification;

public class SmsNotification implements Notification {

    @Override
    public void userNotifier() {
        System.out.println("Enviando notificação por SMS ... ");
    }
}
