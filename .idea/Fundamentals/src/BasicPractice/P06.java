package BasicPractice;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String language= scanner.nextLine();
        switch (language){
            case "England":
            case "USA":
                System.out.print("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.print("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;

        }

    }
}
