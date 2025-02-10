import java.util.Scanner;
class WaiterQspider
{
	public static void main(String[] args)
	{
		System.out.println("Enter Total");
		Scanner sc = new Scanner(System.in);
		float total=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Rate");
		float rate=sc.nextFloat();

		float tottal_rate=(total*rate)/100;

		float subtotal=tottal_rate+total;
		System.out.println(subtotal);
	}
}