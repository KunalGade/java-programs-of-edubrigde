package threadop;

class Threadtable implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("****Thread Table****");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
		
	}
	
}
 class Threadfactorial implements Runnable
 {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=5;
		int fact=1;
		System.out.println("****factorial Thread****");
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of"+n+"="+fact);
		
	}
	 
 }
 class Threadfibonacci implements Runnable
 {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int temp=0;
		int a=0;
		int b=1;
		System.out.println("****fibonacci in thread****");
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(int i=1;i<=5;i++)
		{
			temp=a+b;
			System.out.println(temp+" ");
			a=b;
			b=temp;
		}
		
	}
	 
 }
class Threadmultiop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadmultiop op=new Threadmultiop();
		 Threadtable t=new  Threadtable ();
		 t.run();
		 Threadfactorial t1=new Threadfactorial();
		 t1.run();
		 Threadfibonacci t2=new Threadfibonacci();
		 t2.run();
	}

}
