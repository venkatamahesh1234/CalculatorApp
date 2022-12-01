class Calculator
{
	int first;
	int second;
	
	int sumResult;
	int subResult;
	int mulResult;
	int remResult;
	
	double divResult;
	
	Calculator()
	{
	}
	
	Claculator(int a,int b)
	{
		first = a;
		second = b;
		
	}
	public void perfromAdd()
	{
		sumResult = first + second;
	}
}
class CalculatorManager
{
	public static void main(String args[])
	{
		Calculator c=new Calculator(10,5);
		c.perfromAdd();
		c.displaySum();
		c.displaySub();
	}
}