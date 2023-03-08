package corejava;
class Calculator
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static float div(float a,float b)
	{
		return a/b;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	String greet(String s)
	{
		return "hello"+s;
	}
}
public class Staticmethod {
    static int sub(int a,int b)
    {
    	return a-b;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Addtion:"+Calculator.add(10, 12));
          System.out.println("division:" +Calculator.div(10, 12));
          System.out.println("substraction:"+ sub(10, 12));
          Calculator c=new  Calculator();
          int m=c.mul(11, 12);
          System.out.println("Mul:"+m);
          System.out.println("String method:"+c.greet("swap"));
	}

}
