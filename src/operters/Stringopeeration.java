package operters;

public class Stringopeeration {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
      String a="cooking";
	System.out.println("String a:"+a);
	
	String b=new String("king");
	System.out.println("String b:"+b);
	
	System.out.println("length of string"+a.length());
	System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());
    System.out.println(a.charAt(3));
    System.out.println(a.isEmpty());
    System.out.println(a.compareTo(b));
    System.out.println(a.equalsIgnoreCase(b));
    System.out.println(a.indexOf(3));
    System.out.println(a.startsWith(b));
	}
}
    