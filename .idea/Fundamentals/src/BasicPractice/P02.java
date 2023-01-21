package BasicPractice;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            if (Double.parseDouble(scanner.nextLine())>=3.00) System.out.print("Passed!");
            else System.out.print("Failed!");

        }
    }
}
