package threadop;

class Threadfirst extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Thread is running");
	}
}
class Threadsecond extends Thread
{
	public void run()
	{
		for(int i=5;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("Thread is running");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadfirst t1=new Threadfirst  ();
		t1.run();
		Threadsecond t2=new Threadsecond();
		t2.run();
		
	}

}
