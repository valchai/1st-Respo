package BasicLab;

import java.util.Scanner;

public class L04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());
        int y=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i=x; i<=y; i++)
        {
            sum+=i;
            System.out.printf("%d ",i);
        }
        System.out.printf("%nSum: %d",sum);
    }
}
