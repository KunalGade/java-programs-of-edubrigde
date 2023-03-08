package javaadvop;

import java.util.HashMap;

public class Charactercount {
	
	static HashMap<Character ,Integer>Charactercount(char arr[])
	{
		HashMap<Character ,Integer> hm=new HashMap<>();
	for(char ch:arr)
	{
		if(hm.containsKey(ch))
		{
			hm.put(ch, hm.get(ch)+1);
		}
		else
			hm.put(ch, 1);
	}
	return hm;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char arr[]= {'a','b','a','c','c'};
       HashMap<Character ,Integer> hm=Charactercount ( arr);
       System.out.println(hm);
	}

}
