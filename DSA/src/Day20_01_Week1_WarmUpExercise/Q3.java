package Day20_01_Week1_WarmUpExercise;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of random numbers to generate: ");
        int n = scanner.nextInt();

        System.out.print("Enter the maximum range for the random numbers: ");
        int maxRange = scanner.nextInt();

        Random random = new Random();
        System.out.println("Generated random numbers:");
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(maxRange);
            System.out.println(randomNumber);
        }


    }
}
