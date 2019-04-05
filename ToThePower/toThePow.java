import java.lang.*;

public class toThePow
{
	public static void main(String[] args) {
		
		int a = 5,b = 6;
		long r = 1;

		for(int i=0;i<b;i++)
		{
			r = r*a;
		}
		System.out.println("To The Power is : "+r);
	}
}