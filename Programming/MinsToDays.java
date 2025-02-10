import java.util.Scanner;

class MinsToDays {
    public static void main(String[] args) {
        System.out.print("Enter a numberof minits : ");
        Scanner sc = new Scanner(System.in);
        int minits = sc.nextInt();

        int days = (minits / 60) / 24;
        int years = days / 365;
        int extraDays = days % 365;

        System.out.println(years);
        System.out.println(extraDays);
    }
}
