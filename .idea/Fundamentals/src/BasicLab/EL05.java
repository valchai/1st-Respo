package BasicLab;

import java.util.Scanner;

public class EL05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inp=Integer.parseInt(scanner.nextLine());
        String input=""+inp;
        String message="";
        while (input.charAt(0)!=(char)32){
            int x=97;
            switch (input.charAt(0)){
                case '2': x=97+input.length()-1; break;
                case '3': x=97+3+input.length()-1; break;
                case '4': x=97+6+input.length()-1; break;
                case '5': x=97+9+input.length()-1; break;
                case '6': x=97+12+input.length()-1; break;
                case '7': x=97+15+input.length()-1; break;
                case '8': x=97+19+input.length()-1; break;
                case '9': x=97+22+input.length()-1; break;
                case '0': x=32; break;
            }
            message+=(char)x;
            input=scanner.nextLine();
        }
        System.out.printf("%s",message);
    }
}
