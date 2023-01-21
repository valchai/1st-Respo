package BasicLab;

import java.util.Scanner;

public class EL03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double spent = budget;
        String input = "";
        while (!(input = scanner.nextLine()).equals("Game Time")) {
            double cost = 0.0;
            int x=0;
            switch (input) {

                case "RoverWatch Origins Edition":
                case "OutFall 4":
                    cost = 39.99;
                    x++;
                    break;
                case "CS: OG":
                    cost = 15.99;
                    x++;
                    break;
                case "Zplinter Zell":
                    cost = 19.99;
                    x++;
                    break;
                case "Honored 2":
                    cost = 59.99;
                    x++;
                    break;
                case "RoverWatch":
                    cost = 29.99;
                    x++;
                    break;

                default:
                    System.out.println("Not Found");
                    break;

            }
            if (x==0) {continue;}
            if (cost > spent) System.out.println("Too Expensive");
            else {spent -= cost;
                System.out.printf("Bought %s%n",input);}
            if (spent == 0.00) {
                System.out.print("Out of money!");
                break;
            }
        }
        if (input.equals("Game Time")) System.out.printf("Total spent: $%.2f. Remaining: $%.2f", budget - spent, spent);
    }
}
