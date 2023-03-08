package operters;

public class Helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer str=new StringBuffer("cooking");
       str.append("Emerging");
       System.out.println(str);
       
       str.insert(10,"Technology");
       System.out.println(str);
       
       str.replace(8, 16, "iot");
       System.out.println(str);
       
       str.reverse();
       System.out.println(str);
	
       System.out.println(str.capacity());

}
}