import java.lang.*;

public  abstract class BasicCalculator implements ICalculation
{
	private double value1;
	private double value2;
	
	public BasicCalculator(){}
	public BasicCalculator(double v1, double v2)
	{
		value1 = v1;
		value2 = v2;
	}
	
	public void setValue1(double v1)
	{
		v1 = value1;
	}
	
	public void setValue2(double v2)
	{
		v2 = value2;
	}
	
	public double getValue1()
	{
		return value1;
	}
	public double getValue2()
	{
		return value2;
	}
	
	
}