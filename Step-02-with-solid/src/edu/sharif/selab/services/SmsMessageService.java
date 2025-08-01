package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;
import edu.sharif.selab.services.Validator;

public class SmsMessageService implements MessageService<SmsMessage>{
    @Override
    public void sendMessage(SmsMessage smsMessage) {
        if(Validator.validatePhoneNumber(smsMessage.getSourcePhoneNumber()) && Validator.validatePhoneNumber(smsMessage.getTargetPhoneNumber())){
            System.out.println("Sending a SMS from " + smsMessage.getSourcePhoneNumber() + " to " + smsMessage.getTargetPhoneNumber() + " with content : " + smsMessage.getContent());
        }else{
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }
}
