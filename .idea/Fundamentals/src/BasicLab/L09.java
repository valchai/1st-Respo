package BasicLab;

import java.util.Scanner;

public class L09 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double totalPrice=0.0;
        for (int i=0; i<n;i++)
        {
            double price=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsulesCount=Integer.parseInt(scanner.nextLine());
            double temp=price*days*capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f%n",temp);
            totalPrice+=temp;
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
