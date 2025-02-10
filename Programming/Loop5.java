import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        System.out.println("----- Table of " + num + " -----");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a * num);
        }
    }
}
