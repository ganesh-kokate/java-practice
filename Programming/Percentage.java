import java.util.Scanner;
class Percentage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = sc.nextInt();

		float percentage = (marks*100)/600;
		System.out.println(percentage);

		String result=(percentage>=35.0)?"Pass":"FAIL";
		System.out.println(result);

		String grade = (percentage>=75)?"Grade A":
				(percentage>=60)?"Grade B":
				(percentage>=35)?"Grade C":"Fail";

		
	}
}