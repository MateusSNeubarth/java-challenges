
import java.util.Scanner;

public class EvenOrOdd {

    // Method to check if a String only contain numbers
    static boolean checkNum(String str) {
        String nums = "1234567890";
        for (int i = 0; i < str.length(); i++) {
            if (!nums.contains(Character.toString(str.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        // Scanner class to get user input
        Scanner input = new Scanner(System.in);
        // Create variables that will be used
        String bino;
        String cino;
        // get Bino's input and checks if it's a number
        while (true) {
            System.out.println("How many fingers did Bino put?");
            bino = input.nextLine();
            if (checkNum(bino)) {
                break;
            }
            System.out.println("Please, only numbers allowed");
        }
        // get Cino's input and checks if it's a number
        while (true) {
            System.out.println("How many fingers did Bino put?");
            cino = input.nextLine();
            if (checkNum(cino)) {
                break;
            }
            System.out.println("Please, only numbers allowed");
        }

        // Check if sum of both is even or odd to see who wins
        if ((Integer.parseInt(bino) + Integer.parseInt(cino)) % 2 == 0) {
            System.out.println("Bino wins!");
        } else {
            System.out.println("Cino wins!");
        }

        // Close Scanner
        input.close();
    }
}
