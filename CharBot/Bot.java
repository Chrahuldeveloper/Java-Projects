import java.util.Random;
import java.util.Scanner;

class Bot {
    public static void main(String[] args) {
        System.out.println("Hii, I am an ChatBot,How can i help you :)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Name ?");
        String Username = scan.nextLine();
        String Usermessage = scan.nextLine();
        if (Usermessage.equalsIgnoreCase("exit")) {
            System.out.println("Bye" + Username + "Have a Nice day :)");
        } else {
            System.out.println("Chat!");
            Random random = new Random();
            int randomNumber = random.nextInt(5);
            String[] response = {
                    "I'm not sure what you mean.",
                    "Interesting! Tell me more.",
                    "That's cool!",
                    "Sorry, I didn't understand that.",
                    "Can you please rephrase that?"
            };
            System.out.println(response[randomNumber]);
        }

    }

}
