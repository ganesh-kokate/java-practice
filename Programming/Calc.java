import java.util.Scanner;
class Calc{

	public static void main(String arr[])
	{
		System.out.println("Enter a Number");
		float a= new Scanner(System.in).nextFloat();

		System.out.println("Enter a Number");
		float b= new Scanner(System.in).nextFloat();

		System.out.println("Enter a Operand");
		char c= new Scanner(System.in).next();

		float opt=0;

		opt = (c=='+')?a+b:
			(c=='-')?a-b:
			(c=='*')?a*b:
			(c=='/')?a/b:
			(c=='%')?a%b:
			

	}

}