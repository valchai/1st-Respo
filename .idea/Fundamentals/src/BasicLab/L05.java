package BasicLab;
import java.util.Scanner;
public class L05 {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            String reverse="";
            String user= scanner.nextLine();
            char ch;
            int count=0;
            for (int i=0; i<user.length(); i++)
            {
                ch= user.charAt(i);
                reverse= ch+reverse;
            }
            for (int i=0; i<4;i++){
                if (!reverse.equals(scanner.nextLine())) {
                    count++;
                    if (count < 4) System.out.println("Incorrect password. Try again.");
                    else {
                        System.out.printf("User %s blocked!",user);
                        break;
                    }
                }
                else {
                    System.out.printf("User %s logged in.",user);
                    break;
                }

            }
        }
}
