import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int n= new Scanner(System.in).nextInt();

		System.out.println(n/2 == n/2.0); // when we devide by int with int res will be int and if we devide int with float res will be float so if the number is odd lhs is not equale to rhs

		System.out.println((n/2)*2 == n); 
	}
}