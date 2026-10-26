import java.util.Scanner;

public class RuleBasedChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     WELCOME TO CHATBOT");
        System.out.println("================================");
        System.out.println("Type 'bye' or 'exit' to stop.");
        System.out.println();

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().trim().toLowerCase();

            // Exit rule
            if (input.equals("bye") ||
                input.equals("exit") ||
                input.equals("quit")) {

                System.out.println("Bot: Goodbye! Have a nice day!");
                break;
            }

            // Greeting rules
            else if (input.matches(".*\\b(hello|hi|hey)\\b.*")) {
                System.out.println(
                    "Bot: Hello! How can I help you?"
                );
            }

            // Ask for the bot's name
            else if (input.contains("your name")) {
                System.out.println(
                    "Bot: I am a simple rule-based chatbot."
                );
            }

            // Ask how the bot is doing
            else if (input.contains("how are you")) {
                System.out.println(
                    "Bot: I am fine! Thanks for asking."
                );
            }

            // Ask about capabilities
            else if (input.contains("help") ||
                     input.contains("what can you do")) {
                System.out.println(
                    "Bot: I can respond to greetings, " +
                    "answer basic questions, tell the time, " +
                    "and respond to common queries."
                );
            }

            // Time-related query
            else if (input.contains("time")) {
                java.time.LocalTime time =
                    java.time.LocalTime.now();

                System.out.println(
                    "Bot: Current time is " +
                    time.format(
                        java.time.format.DateTimeFormatter
                            .ofPattern("hh:mm a")
                    )
                );
            }

            // Date-related query
            else if (input.contains("date") ||
                     input.contains("today")) {
                java.time.LocalDate date =
                    java.time.LocalDate.now();

                System.out.println(
                    "Bot: Today's date is " + date
                );
            }

            // Thanks rule
            else if (input.contains("thank")) {
                System.out.println(
                    "Bot: You're welcome!"
                );
            }

            // Goodbye message
            else if (input.contains("good morning")) {
                System.out.println(
                    "Bot: Good morning! Have a great day!"
                );
            }

            else if (input.contains("good night")) {
                System.out.println(
                    "Bot: Good night! Sleep well."
                );
            }

            // Default response
            else {
                System.out.println(
                    "Bot: Sorry, I don't understand that. " +
                    "Please try another question."
                );
            }

            System.out.println();
        }

        sc.close();
    }
}
