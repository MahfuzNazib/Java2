import java.lang.*;
import java.util.Scanner;

public class GradCalculation
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Grade Calculation Program");
		System.out.println("-------------------------");

		int subList;
		double totalNumber = 0.0;
		System.out.print("Enter Total Number of Subjects : ");
		subList = input.nextInt();

		int credit = (subList*3);

		String name[] = new String[subList];

		for(int counter = 0; counter <subList ;counter++)
		{
			System.out.print("Enter Subject ["+(counter+1)+"] : ");
			input.next();
			name[counter] = input.nextLine();
			

		}
		
		System.out.println("__________________________________");
		System.out.println("Enter your Subjects Marks");		

		//input.close();

		/*for(int counter = 0; counter < subList; counter++)
		{
			System.out.println("["+(counter+1)+"]"+name[counter]);
			System.out.print("Marks : ");
			double d = input.nextDouble();
		}
		*/

		for(int counter = 0; counter < subList; counter++)
		{
			System.out.print("["+(counter+1)+"] -> Marks : ");
			double d = input.nextDouble();
		}
	}
}