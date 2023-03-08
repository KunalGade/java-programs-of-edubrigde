package collectionprgs;

import java.util.HashMap;

public class Mapoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Integer,String>hm=new HashMap<>();
      hm.put(1, "abc");
      hm.put(27, "xyz");
      hm.put(13, "eds");
      hm.putIfAbsent(27,"pqr");
      System.out.println("MAP:"+hm);
	}

}
