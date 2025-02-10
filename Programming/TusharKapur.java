import java.util.Scanner;
class TusharKapur
{

	public static void main(String[] args)
	{
		int a = new Scanner(System.in).next().charAt(0);
		Boolean ans=(a=='a' || a == 'e' || a=='i' || a=='o' || a=='u') ? true:false;
		System.out.println(ans);
	}

}