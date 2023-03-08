package mypack;

public class MethodOverloading {
	void sum (int a)
	{
		System.out.println("sum is"+(++a));
	}
	void sum (int a,int b)
	{
		System.out.println("sum is"+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("sum is"+(a+b+c));
	}
	float sum(float a,float b)
	{
		return a+b;
		
	}
	float sum(float a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m1=new MethodOverloading();
		m1.sum(4);
		MethodOverloading m2=new MethodOverloading();
		m2.sum(8,4);
		MethodOverloading m3=new  MethodOverloading();
		m3.sum(2, 4, 6);
		MethodOverloading m4=new MethodOverloading();
		m4.sum(3.4f, 5.6f);
		float sum=m4.sum(3.4f, 5.6f);
		System.out.println("sum is:"+sum);
		MethodOverloading m5=new MethodOverloading();
		float sum1=m5.sum(3.2f, 5);
		System.out.println("sum is:"+sum1);
		
	}

}
