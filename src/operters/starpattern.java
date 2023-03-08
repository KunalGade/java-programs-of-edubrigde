package operters;

public class starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int size=5;
        for(int i=0;i<size;i++)
        {
        	for(int j=1;j<size-1;j++)
        	{
        		System.out.println(" ");
        	}
        	for(int k=0;k<=1;k++)
        	{
        		System.out.println("*");
        	}
        	System.out.println();
        }
	}

}
