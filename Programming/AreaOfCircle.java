import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		float r=sc.nextFloat();
		float pie=22/7;
		
		float area = pie*(r*r);
		float perimeter = 2*pie*r;

		System.out.println("Area of Circle = " + area);
		System.out.println("Perimeter of Circle = " + perimeter);

		
	}
}