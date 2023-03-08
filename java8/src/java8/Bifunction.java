package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Bifunction {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			BiFunction<Integer, Integer, Integer> fun= (x1,x2) -> x1+x2;
			Integer result = fun.apply(2, 5);
			System.out.println(result);
			
			
			BiFunction<Integer, Integer, Double> fun1= (x1,x2) -> Math.pow(x1, x2); //2 integers and returns Doube
			Double result1 = fun1.apply(2, 5);
			System.out.println(result1);
			
			BiFunction<Integer, Integer, List> fun3= (x1,x2) -> Arrays.asList(x1+x2); //2 Integers and return List
			List<Integer> result3 = fun3.apply(2, 5);
			System.out.println(result3);
			
			

		}

	}

	
