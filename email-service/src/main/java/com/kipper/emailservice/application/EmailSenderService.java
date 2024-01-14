package com.kipper.emailservice.application;

import com.kipper.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderSateway emailSenderGateway;

    @Autowired
    public EmailSenderService(emailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
        


    }

    public void sendEmail(String to, String subject, String body){
        
    }
}