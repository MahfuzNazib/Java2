import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		ScientificCalculator sc = new ScientificCalculator(10.0,5.0);
		System.out.println("Value1      : "+sc.getValue1());
		System.out.println("Value2      : "+sc.getValue2());
		System.out.println("Addition    : "+sc.add());
		System.out.println("Subtraction : "+sc.subtract());
		System.out.println("Multiply    : "+sc.multiply());
		System.out.println("Divide      : "+sc.divide());
		//System.out.println("To The power: "+sc.toThePow());
	}
}