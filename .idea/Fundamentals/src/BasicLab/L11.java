package BasicLab;

import java.util.Scanner;

public class L11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lostG=Integer.parseInt(scanner.nextLine());
        double headsetP=Double.parseDouble(scanner.nextLine());
        double mouseP=Double.parseDouble(scanner.nextLine());
        double keyboardP=Double.parseDouble(scanner.nextLine());
        double displayP=Double.parseDouble(scanner.nextLine());
        double ragePrice=(lostG/2)*headsetP+(lostG/3)*mouseP+(lostG/6)*keyboardP+(lostG/12)*displayP;
        System.out.printf("Rage expenses: %.2f lv.",ragePrice);
    }
}
