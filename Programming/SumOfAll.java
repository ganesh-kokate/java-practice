import java.util.Scanner;

class SumOfAll {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        int rem = 0;
        int sum = 0;

        int a = n % 10;
        sum = sum + a;
        n = n / 10;

        a = n % 10;
        sum = sum + a;
        n = n / 10;

        a = n % 10;
        sum = sum + a;
        n = n / 10;

        System.out.print(sum);

    }
}