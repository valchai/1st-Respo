package BasicLab;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double change=0.0;
        String temp="";
        while (!(temp=scanner.nextLine()).equals("Start"))
        {
            double money=Double.parseDouble(temp);
            if (money != 0.1 && money != 0.2 && money != 0.5 && money !=1.0 && money != 2.0) System.out.printf("Cannot accept %.2f%n",money);
            else change+=money;
        }
        change=Math.round(change*100.0)/100.0;
        while (!(temp=scanner.nextLine()).equals("End")) {
            switch (temp) {
                case "Nuts":
                    if (change >= 2.0) {change -= 2.0;
                    System.out.println("Purchased Nuts");}
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Water":
                    if (change >= 0.7) {change -= 0.7;
                    System.out.println("Purchased Water");}
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Crisps":
                    if (change >= 1.5) {change -= 1.5;
                    System.out.println("Purchased Crisps");}
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Soda":
                    if (change >= 0.8) {change -= 0.8;
                    System.out.println("Purchased Soda");}
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Coke":
                    if (change >= 1.0) {change -= 1.0;
                    System.out.println("Purchased Coke");}
                    else System.out.println("Sorry, not enough money");
                    break;
                default:System.out.println("Invalid product");
                    break;
            }
        }
        System.out.printf("Change: %.2f",change);
    }
}
