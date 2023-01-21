package BasicLab;

import java.util.Scanner;

public class L10{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double moneyLukas=Double.parseDouble(scanner.nextLine());
        int countStudents=Integer.parseInt(scanner.nextLine());
        double lightSaber=Double.parseDouble(scanner.nextLine());
        double costLS=Math.ceil(countStudents*1.1)*lightSaber;
        double robe=Double.parseDouble(scanner.nextLine());
        double costR=countStudents*robe;
        double belt=Double.parseDouble(scanner.nextLine());
        double costB=(countStudents-(countStudents / 6))*belt;
        double cost=costLS+costR+costB;
        if (moneyLukas>=cost) System.out.printf("The money is enough - it would cost %.2flv.",cost);
        else System.out.printf("George Lucas will need %.2flv more.",cost-moneyLukas);

    }
}
