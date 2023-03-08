package java8;

import java.util.ArrayList;
import java.util.List;


public class Lambdaex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> list= new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      
      System.out.println("Traversing for each");
      for(Integer element:list)
      {
    	  System.out.println(element);
      }
      
      System.out.println("Traversing using lambda");
      list.forEach(element -> System.out.println(element));
	}

}
