import java.util.Scanner;
class EvenOddSame
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int n= new Scanner(System.in).nextInt();

		int evensum=0;
		int oddsum=0;

		int rem = 0;
        	int sum = 0;

        	int a = n % 10;
		if(a%2==0)
		{
			evensum = evensum + a;
		}
        	else{
			oddsum=oddsum+a;
		}
        	n = n / 10;

        	a = n % 10;
		if(a%2==0)
		{
			evensum = evensum + a;
		}
        	else{
			oddsum=oddsum+a;
		}
        	
        	n = n / 10;

        	a = n % 10;
		if(a%2==0)
		{
			evensum = evensum + a;
		}
        	else{
			oddsum=oddsum+a;
		}
        	
        	n = n / 10;

		a = n % 10;
		if(a%2==0)
		{
			evensum = evensum + a;
		}
        	else{
			oddsum=oddsum+a;
		}
        	
        	n = n / 10;

		System.out.println(evensum);
		System.out.println(oddsum);
		
	}
}