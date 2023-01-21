package BasicLab;

import java.util.Scanner;

public class L02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int biggest=0;
        boolean divisible=false;
        if (n%2==0) {biggest=2; divisible=true;}
        if (n%3==0) {biggest=3;divisible=true;}
        if (n%6==0) {biggest=6;divisible=true;}
        if (n%7==0) {biggest=7;divisible=true;}
        if (n%10==0) {biggest=10;divisible=true;}
        if (divisible) System.out.printf("The number is divisible by %d",biggest);
        else System.out.println("Not divisible");
    }
}
