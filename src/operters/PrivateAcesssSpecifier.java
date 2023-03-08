package operters;
class priv
{
	private void print()
	{
		System.out.println("Private variable access:");
	}
	 void getprint() {
		print();
	}
}

public class PrivateAcesssSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        priv priv=new priv();
        priv.getprint();
        
	}

}
