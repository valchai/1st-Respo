package BasicLab;

import java.util.Scanner;

public class EL01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());
        int y=Integer.parseInt(scanner.nextLine());
        int z=Integer.parseInt(scanner.nextLine());
        int max=x;
        int mid=y;
        int min=z;
            if (max<y) max=y;
            if (max<z) max=z;
            if (min>x) min=x;
            if (min>y) min=y;
            if (x>=y && y>=z) mid=y;
            if (x>=z && z>=y) mid=z;
            if(y>=x && x>=z) mid=x;
            if(y>=z && z>=x) mid=z;
            if (z>=x && x>=y) mid=x;
            if (z>=y && y>=x) mid=y;
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
