import java.util.Scanner;

class PoundToKilogram {

    public static void main(String[] args) {
        System.out.println("Enter a weight in pounds");
        float n = new Scanner(System.in).nextFloat();
        System.out.println(" Weight in Kg : " + ((float) n * 0.453592));

    }

}
