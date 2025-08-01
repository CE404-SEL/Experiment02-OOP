package edu.sharif.selab.factory;

import edu.sharif.selab.models.*;

import java.util.Scanner;

public class MessageFactory {
    private final Scanner scanner;

    public MessageFactory(Scanner scanner) {
        this.scanner = scanner;
    }

    public Message createMessage(int type) {
        String source;
        String target;
        String content;

        switch (type) {
            case 1: // SMS
                SmsMessage sms = new SmsMessage();
                System.out.print("Enter source phone: ");
                sms.setSourcePhoneNumber(scanner.next());
                System.out.print("Enter target phone: ");
                sms.setTargetPhoneNumber(scanner.next());
                System.out.print("Write your message: ");
                scanner.nextLine(); // consume leftover newline
                sms.setContent(scanner.nextLine());
                return sms;

            case 2: // Email
                EmailMessage email = new EmailMessage();
                System.out.print("Enter source email: ");
                email.setSourceEmailAddress(scanner.next());
                System.out.print("Enter target email: ");
                email.setTargetEmailAddress(scanner.next());
                System.out.print("Write your message: ");
                scanner.nextLine(); // consume leftover newline
                email.setContent(scanner.nextLine());
                return email;

            case 3: // Telegram
                TelegramMessage telegram = new TelegramMessage();
                System.out.print("Enter source phone: ");
                telegram.setSourcePhoneNumber(scanner.next());
                System.out.print("Enter target phone: ");
                telegram.setTargetPhoneNumber(scanner.next());
                System.out.print("Write your message: ");
                scanner.nextLine(); // consume leftover newline
                telegram.setContent(scanner.nextLine());
                return telegram;

            default:
                return null;
        }
    }
}
