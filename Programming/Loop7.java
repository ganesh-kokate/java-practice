import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {
        System.out.println("Enter ur Username");
        String str   = new Scanner(System.in).nextLine();
        char c;
        for(int i =0;i<str.length();i++)
        {
            c=str.charAt(i);
            System.out.println(c);
        }
    }
}
