package javaadvop;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestDemo {

	public static int add(int a,int b) {
		// TODO Auto-generated method stub
      return a+b;
	}
	@Test
	public void addTest()
	{
		assertNotEquals(6 , add(4,1));
	}

}
