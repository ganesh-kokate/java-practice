import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {
        System.out.println("Enter ur Username");
        String str = new Scanner(System.in).nextLine();
      
        for (int i = 0; i < str.length(); i++) 
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                System.out.println( i + " "+  str.charAt(i));
        
    }
}
