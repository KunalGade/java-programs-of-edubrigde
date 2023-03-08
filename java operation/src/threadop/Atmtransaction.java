package threadop;

public class Atmtransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<4;i++)
     {
    	 Accountholder t=new Accountholder();
    	 t.setName("person"+i);
    	 t.start();
     }
	}

}
class Atmcentere
{
	static synchronized void userAction()
	{
		System.out.println(Thread.currentThread().getName()+"entered");
		System.out.println("performed transaction");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" transaction completed ");
		System.out.println(Thread.currentThread().getName()+" leaving");
		System.out.println("---------");
	}
}
class Accountholder extends Thread throws IOException
{
	public void run()//method overide nessary
	{
		try
		{
			Atmcentere.userAction();
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
}
}