package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;
import edu.sharif.selab.services.Validator;

public class TelegramMessageService implements MessageService<TelegramMessage>{

    @Override
    public void sendMessage(TelegramMessage telegramMessage) {
        if(Validator.validatePhoneNumber(telegramMessage.getSourcePhoneNumber()) && Validator.validatePhoneNumber(telegramMessage.getTargetPhoneNumber())){
            System.out.println("Sending a Telegram message from " + telegramMessage.getSourcePhoneNumber() + " to " + telegramMessage.getTargetPhoneNumber() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }
}
