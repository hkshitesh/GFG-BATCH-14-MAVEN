package mypkg;
public class MyCalculator {
	public int sum(int a , int b)
	{
		return a+b;
	}
	public int diff(int a , int b)
	{
		return a-b;
	}
	public int mul(int a , int b)
	{
		return a*b;
	}
	public int div(int a , int b)
	{
		return a/b;
	}
	public void display()
	{
		System.out.println("Hello GFG B14!");
	}
	public void alert()
	{
		System.out.println("Alert for any update");
	}
	public void greeting()
	{
		System.out.println("Hello from GitHub");
	}
	public static void main(String[] args) {	
		MyCalculator calc = new MyCalculator();
		System.out.println("Sum is :"+calc.sum(20, 10));
		System.out.println("Diff is :"+calc.diff(20, 10));
		System.out.println("Multiply is :"+calc.mul(20, 10));
		System.out.println("Division is :"+calc.div(20, 10));
	}
}
