package org.gfg.notification;

import org.springframework.stereotype.Component;

@Component
public class MailGateway {

    public void sendMail(String mail){
        System.out.println(mail);
    }
}
