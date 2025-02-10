class Swap
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
	}
}

//a=10
//b=20

//a=10+20=30
//b=20-10=10
//a=20-10=10