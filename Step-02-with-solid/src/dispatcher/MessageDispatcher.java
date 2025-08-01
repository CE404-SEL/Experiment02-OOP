package edu.sharif.selab.dispatcher;

import edu.sharif.selab.models.*;
import edu.sharif.selab.services.*;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher {
    private final Map<Class<? extends Message>, MessageService<? extends Message>> handlers = new HashMap<>();

    public MessageDispatcher() {
        handlers.put(SmsMessage.class, new SmsMessageService());
        handlers.put(EmailMessage.class, new EmailMessageService());
        handlers.put(TelegramMessage.class, new TelegramMessageService());
    }

    @SuppressWarnings("unchecked")
    public <T extends Message> void dispatch(T message) {
        MessageService<T> service = (MessageService<T>) handlers.get(message.getClass());
        if (service == null) {
            throw new IllegalArgumentException("No handler found for: " + message.getClass());
        }
        service.sendMessage(message);
    }
}
