package BasicPractice;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while (true){
           int n = Integer.parseInt(scanner.nextLine());
           if (n%2==0) {System.out.printf("The number is: %d",Math.abs(n)); break;}
           else System.out.println("Please write an even number.");
       }
    }

}
