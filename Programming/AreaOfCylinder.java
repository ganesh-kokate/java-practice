
import java.util.Scanner;

class AreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        float radius = sc.nextFloat();
        System.out.println("Enter radius : ");
        float height = sc.nextFloat();

        float pie = 22 / 7;
        float area = pie * (radius * radius);
        float volume = area * height;

        System.out.println("Area of Circle = " + area);
        System.out.println("Area of Circle = " + volume);

    }
}
