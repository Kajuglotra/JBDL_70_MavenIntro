package org.gfg.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@ --> At
@Component("notificationService1")
//@Scope(value = "prototype")
//@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
public class NotificationService { // notificationService

//    @Autowired
    private SmsGateway smsGateway;
    // field DI

    // constructor DI
//    public NotificationService(SmsGateway smsGateway) {
//        this.smsGateway = smsGateway;
//    }

    // setter DI

    @Autowired
    public void setSmsGateway(SmsGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    private String msg;


    @Autowired
    private MailGateway mailGateway;

    public void sendSms(String sms){
        smsGateway.sendSMS(sms);
    }

    private void sendMail(String mail){
        mailGateway.sendMail(mail);
    }
}
