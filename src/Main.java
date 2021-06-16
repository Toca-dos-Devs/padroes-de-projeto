import com.tocadosdevs.designpatterns.factoryMethod.NotificationFactory;
import com.tocadosdevs.designpatterns.factoryMethod.enums.NotificationChannels;

public class Main {
    public static void main(String [] args){
        var notificationFactory = new NotificationFactory();
        //First notification
        var sendSms = notificationFactory.newNotification(NotificationChannels.SMS);
        sendSms.userNotifier();

        //First notification
        var sendPush = notificationFactory.newNotification(NotificationChannels.PUSH);
        sendPush.userNotifier();

        //First notification
        var sendEmail = notificationFactory.newNotification(NotificationChannels.EMAIL);
        sendEmail.userNotifier();
    }
}
