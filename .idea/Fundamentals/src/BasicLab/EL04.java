package BasicLab;

import java.util.Scanner;

public class EL04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        for (int i=input.length();i>0; i--){
            System.out.print(input.charAt(i-1));
        }
    }
}
