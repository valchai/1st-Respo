package BasicLab;

import java.util.Scanner;

public class L06 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String check=""+n;
        int sum=0;
        for(int i =0; i<check.length();i++)
        {   int fact=1;
            String temp=""+check.charAt(i);
            int j=Integer.parseInt(temp);
           for (int x=1; x<=j;x++){
               fact*=x;
           }
           sum+=fact;
        }if (sum==n)System.out.println("yes");
        else System.out.println("no");
    }
}
