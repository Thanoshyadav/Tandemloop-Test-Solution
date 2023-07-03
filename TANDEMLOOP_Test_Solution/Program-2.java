package practic;

import java.util.Scanner;

 class NumberSeries {
    public static void main(String[] args) {
        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        
        // Generate and print the series
        for (int i = 1; i <= a; i++) {
            System.out.print(2 * i - 1);
            if (i < a) {
                System.out.print(", ");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
