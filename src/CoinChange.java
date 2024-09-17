
import java.util.Scanner;

public class CoinChange {

    public static void main(String args[]) {
        // Start Scanner object
        Scanner input = new Scanner(System.in);

        // Total sum of each coin, starting at 0
        int totalOnes = 0;
        int totalFifties = 0;
        int totalTwentyFives = 0;
        int totalTens = 0;
        int totalFives = 0;
        // Recieve user input for total of cents
        System.out.println("How many cents is the change?");
        int cents = input.nextInt();
        if (cents >= 100) {
            totalOnes = cents / 100;
            cents -= totalOnes * 100;
        }
        if (cents >= 50) {
            totalFifties = cents / 50;
            cents -= totalFifties * 50;
        }
        if (cents >= 25) {
            totalTwentyFives = cents / 25;
            cents -= totalTwentyFives * 25;
        }
        if (cents >= 10) {
            totalTens = cents / 10;
            cents -= totalTens * 10;
        }
        if (cents >= 5) {
            totalFives = cents / 5;
            cents -= totalFives * 5;
        }
        int totalCoins = totalOnes + totalFifties + totalTwentyFives + totalTens + totalFives + cents;
        System.out.println("Total of coins: " + totalCoins);
        System.out.println("One dollar coins: " + totalOnes);
        System.out.println("Fifty cents coins: " + totalFifties);
        System.out.println("Twenty-five cents coins: " + totalTwentyFives);
        System.out.println("Ten cents coins: " + totalTens);
        System.out.println("Five cents coins: " + totalFives);
        System.out.println("One cent coins: " + cents);

        // Closes Scanner object
        input.close();
    }
}
