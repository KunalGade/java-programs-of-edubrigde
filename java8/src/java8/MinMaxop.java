package java8;

import java.util.ArrayList;


public class MinMaxop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String >al=new ArrayList<>();
        al.add("ganesh");
        al.add("Aniket");
        al.add("Anita");
        al.add("ram");
        
        long count=al.stream().filter(n ->n.length>5()).count();
        {
        	System.out.println("length"+count);
        }
        long count1=al.stream().filter(n ->n.startsWith(A).count1());
        {
        	System.out.println("string start with A"+count1);
        }
	     String shortest=al.stream().min(comparator.comparing(n ->n.length()).get());
	     {
	    	 System.out.println("shortest string"+shortest);
	     }
	}
	

}
