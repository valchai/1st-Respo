package BasicPractice;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine())+30;
        if (minutes>=60) {hours++;
            minutes-=60;}
        if (hours>=24) hours-=24;
        System.out.printf("%d:%02d",hours,minutes);
    }
}
