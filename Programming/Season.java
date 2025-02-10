import java.util.Scanner;
class Season
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month");
		String month = sc.next();


		String grade = (month == "oct" || month == "nov" || month == "dec" || month == "jan" )?"Winter":
				(month == "feb" || month == "mar" || month == "apr" || month == "may")?"Summer":
				(month == "jun" || month == "jul" || month == "aug" || month == "sept")?"Rainy":"Enter Correct Month";
		System.out.println(grade);
		
	}
}