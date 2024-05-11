package org.gfg.notification;

import org.springframework.stereotype.Component;

@Component
public class SmsGateway { // smsGateway

    public void sendSMS(String msg){
        System.out.println(msg);
    }
}
