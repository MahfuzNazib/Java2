import java.lang.*;
import java.util.Scanner;


public class InputDemo
{
	public static void main(String args[])
	{
		int i;
		double b;
		String s;
		char c;


		Scanner sc = new Scanner(System.in);

		

		System.out.print("Enter a String    : ");
		s = sc.nextLine();

		System.out.print("Enter a Integer   : ");
		i = sc.nextInt();

		System.out.print("Enter a Double    : ");
		b = sc.nextDouble();

		System.out.print("Enter a Character :");
		c = sc.next().charAt(0);

		System.out.println("==========================");

		System.out.println("Your Inputed Values are :-");

		System.out.println("String Value     : "+s);
		System.out.println("Integer Number   : "+i);
		System.out.println("Double Number    : "+b);
		System.out.println("Character value  : "+c);
	}
}