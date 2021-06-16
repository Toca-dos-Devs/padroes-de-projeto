package com.tocadosdevs.designpatterns.factoryMethod.classes;

import com.tocadosdevs.designpatterns.factoryMethod.interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void userNotifier(){
        System.out.println("Enviando notificação pelo email ... ");
    }
}
