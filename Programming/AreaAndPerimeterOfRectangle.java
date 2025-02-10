import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        float length = sc.nextFloat();
        System.out.println("Enter Breadth");
        float breadth = sc.nextFloat();

        float perimeter = 2 * (length + breadth);
        float area = length * breadth;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

    }
}
