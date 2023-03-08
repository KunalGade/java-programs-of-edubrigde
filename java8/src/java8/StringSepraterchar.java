package java8;

public class StringSepraterchar {
	
		public void getStream(String s) {
			s.chars().forEach(i->System.out.print((char)i + " "));
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s="Swapnil";
			new StringSepraterchar().getStream(s);
		}

	}

