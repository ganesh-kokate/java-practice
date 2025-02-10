import java.util.*;

class CurrancyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount in INR");
        float inr = sc.nextFloat();
        System.out.println("\n Choose the Currancy \n 1.USD \n 2.EUR \n 3.GBP \n 4.PKR \n 5.KWD");
        String crncy = sc.next().toUpperCase();

        float converted = 0;

        if (crncy.equals("USD")) {
            converted = inr / 86.56f;
            System.out.print(inr + " : " + converted);
        } else if (crncy.equals("EUR")) {
            converted = inr / 90.56f;
            System.out.print(inr + " : " + converted);
        } else if (crncy.equals("GBP")) {
            converted = inr / 107.68f;
            System.out.print(inr + " : " + converted);
        } else if (crncy.equals("PKR")) {
            converted = inr / 0.3f;
            System.out.print(inr + " : " + converted);
        } else if (crncy.equals("KWD")) {
            converted = inr / 280;
            System.out.print(inr + " : " + converted);
        } else {
            System.out.println("Invalid");
        }

    }

}
