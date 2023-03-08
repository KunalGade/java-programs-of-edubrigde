package threadop;

class Threadfirst implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Threadfirst");
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
		
	}
	
}

class Threadtwo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("threadtwo");
		for(int i=7;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	
}

public class Threadinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Threadfirst t=new Threadfirst();
      Thread t2=new Thread(t);
      t2.start();
      Threadtwo tt=new Threadtwo();
      Thread t3=new Thread(tt);
      t3.start();
	}

}
