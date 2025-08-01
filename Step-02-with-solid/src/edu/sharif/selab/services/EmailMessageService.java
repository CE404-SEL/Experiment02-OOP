package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;
import edu.sharif.selab.services.Validator;
import java.util.regex.Pattern;

public class EmailMessageService implements MessageService<EmailMessage>{

    @Override
    public void sendMessage(EmailMessage emailMessage) {
        if(Validator.validateEmailAddress(emailMessage.getSourceEmailAddress()) && Validator.validateEmailAddress(emailMessage.getTargetEmailAddress())){
            System.out.println("Sending a SMS from " + emailMessage.getSourceEmailAddress() + " to " + emailMessage.getTargetEmailAddress() + " with content : " + emailMessage.getContent());
        }else{
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }
}
