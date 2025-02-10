import java.util.Scanner;
class Program21
{

	public static void main(String[] args)
	{
		int a = new Scanner(System.in).nextInt();
		String ans=((a%2==0) && (a%5==0))? ("Hi Two Hi Five"):(a%2==0)?("Hi Two"):((a%5==0)?"Hi Five":"");
		System.out.println(ans);
	}

}