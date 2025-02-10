import java.util.Scanner;
class Charcheck
{

	public static void main(String[] args)
	{
		char c = new Scanner(System.in).next().charAt(0);
		String ans=(c>=65 && c<=90)? ((c>=65 && c <=90)?("It is an Uppercase"):("It is an Lowercase")):((c>=48 && c <=57)?("It is Digit"):("It is a Symbol"));
		System.out.println(ans);
	}

}