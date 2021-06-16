package com.tocadosdevs.designpatterns.factoryMethod;

import com.tocadosdevs.designpatterns.factoryMethod.classes.EmailNotification;
import com.tocadosdevs.designpatterns.factoryMethod.classes.PushNotification;
import com.tocadosdevs.designpatterns.factoryMethod.classes.SmsNotification;
import com.tocadosdevs.designpatterns.factoryMethod.enums.NotificationChannels;
import com.tocadosdevs.designpatterns.factoryMethod.interfaces.Notification;

public class NotificationFactory {

    public Notification newNotification(NotificationChannels methodNotification) {
        switch (methodNotification) {
            case SMS: return new SmsNotification();
            case PUSH: return new PushNotification();
            case EMAIL: return new EmailNotification();
            default:
                throw new IllegalArgumentException("Argumento inválido para criar notificação");
        }
    }
}
