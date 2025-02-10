import java.util.Scanner;
class Loop11
{
	public static void main(String[] arg)
	{
		System.out.println("Enter a number");
		int num=new Scanner(System.in).nextInt();

		int dup=num;

		int sum=0;

		while(num>0)
		{
			int rem = num%10;
			sum=sum+rem;
			num=num/10;
		}

		System.out.println(sum);
		System.out.println(dup);
	}
}