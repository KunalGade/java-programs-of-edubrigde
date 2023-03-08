package threadop;

public class Punchuationex {
	int punchuation(String str)
	{
		int punchuationmarks=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)==':' 
					||str.charAt(i)==';');
					
			punchuationmarks++;
		}
	}
	return punchuationmarks;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punchuationex p=new Punchuationex();
		String str="hi,how are you!";
		System.out.println("total no of puc:"+ p.punchuation(str));
	}

}
