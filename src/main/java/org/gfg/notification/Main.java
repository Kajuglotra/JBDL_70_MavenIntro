package org.gfg.notification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.gfg.notification");
        NotificationService notificationService = (NotificationService) context.getBean("notificationService1");
        System.out.println(notificationService);

        NotificationService notificationService1 = (NotificationService) context.getBean("notificationService1");
        System.out.println(notificationService1);
        notificationService.sendSms("OTP is 9091");
    }
}
