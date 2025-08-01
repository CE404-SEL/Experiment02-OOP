import edu.sharif.selab.dispatcher.MessageDispatcher;
import edu.sharif.selab.factory.MessageFactory;
import edu.sharif.selab.models.Message;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessageFactory factory = new MessageFactory(scanner);
        MessageDispatcher dispatcher = new MessageDispatcher();

        System.out.println("Hello and Welcome to SE Lab Messenger.");

        while (true) {
            System.out.println("\n1: Send SMS");
            System.out.println("2: Send Email");
            System.out.println("3: Send Telegram");
            System.out.println("0: Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 0) break;

            Message message = factory.createMessage(choice);
            if (message != null) {
                try {
                    dispatcher.dispatch(message);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
    }
}
