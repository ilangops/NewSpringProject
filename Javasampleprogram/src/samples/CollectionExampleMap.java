package samples;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class CollectionExampleMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String,Integer> map=new TreeMap<>();
		map.put("Ram",100);
		map.put("Kavin",80);
		map.put("Palani", 90);
		//map.put(null, null);
		map.put("Arun", 70);
		
		//System.out.println(map.sort());
		System.out.println(map.replace("Kavin",80, 40));
		System.out.println(map.containsValue(90));
		System.out.println(map.get(90));
		
		for (String key:map.keySet())
		{
			System.out.println(map.get(key));	
		}
		 
	}

}
