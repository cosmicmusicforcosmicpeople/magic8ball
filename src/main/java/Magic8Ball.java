import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 * To get a response from the user, use the getUserQuestion() method at the bottom of this file
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below
        public static void main(String[] args) {

        // Step 2: Ask the user to enter a question for the magic 8-ball
        System.out.println("(((Concentrate))) Please ask the Magic 8-ball a yes or no question:");

        // Step 3: Call the getUserQuestion() method to get a question from the user
        String userQuestion = getUserQuestion();

        // Step 4: Make a variable and initialize it to a random number
        int randNumber = new Random().nextInt(4); // Get random number from [0, 1, 2, 3]

        // Step 5: If the random number is 0
        if (randNumber == 0) {
            System.out.println("Yes");
        }
        // Step 6: If the random number is 1
        else if (randNumber == 1) {
            System.out.println("No");
        }
        // Step 7: If the random number is 2
        else if (randNumber == 2) {
            System.out.println("(((Concentrate))) Please ask again later.");
        }
        // Step 8: If the random number is 3
        else if (randNumber == 3) {
            System.out.println("It is likely possible!");
        }
    }


    /**
     * @return The user's response as a String
     */
    public static String getUserQuestion(){
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        return question;
    }
}




