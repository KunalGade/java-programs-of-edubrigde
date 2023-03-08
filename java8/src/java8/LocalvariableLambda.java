package java8;

import java.util.Arrays;
import java.util.List;

public class LocalvariableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> obj=Arrays.asList(1,2,3);
     int var=10;
     obj.forEach(x ->System.out.println(x +var));
	}

}
