package BasicLab;

import java.util.Scanner;

public class L03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double multiplier=0;
        String type=scanner.nextLine();
        String day=scanner.nextLine();
        switch (type){
            case "Students":{
                switch (day){
                    case "Friday": multiplier=8.45; break;
                    case "Saturday": multiplier=9.8; break;
                    case "Sunday": multiplier=10.46; break;
                } if (n>=30) multiplier*=0.85;
                break;
            }
            case "Business":{
                switch (day){
                    case "Friday": multiplier=10.9; break;
                    case "Saturday": multiplier=15.6; break;
                    case "Sunday": multiplier=16; break;
                }if (n>=100) n-=10;
                break;
            }
            case "Regular":{
                switch (day){
                    case "Friday": multiplier=15; break;
                    case "Saturday": multiplier=20; break;
                    case "Sunday": multiplier=22.5; break;
                }if (n>=10 && n<=20) multiplier*=0.95;
                break;
            }
        }
        System.out.printf("Total price: %.2f",n*multiplier);
    }
}
