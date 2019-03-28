import java.lang.*;

public class ScientificCalculator extends BasicCalculator implements IScientificCalculation
{
	public ScientificCalculator(){}
	public ScientificCalculator(double v1, double v2)
	{
		super(v1,v2);
		
	}
	
	public double add()
	{
		return super.getValue1() + super.getValue2();
	}
	
	public double subtract()
	{
		return super.getValue1() - super.getValue2();
	}
	
	public double multiply()
	{
		
		return super.getValue1() * super.getValue2();
	}
	
	public double divide()
	{
		
		return super.getValue1() / super.getValue2();
	}
	public double toThePow()   
	{
		//for(int i=0;i<Value2;i++) //NOT WORKING YET
		//{
			return super.getValue1() * super.getValue1();
		
		
	}	
}
