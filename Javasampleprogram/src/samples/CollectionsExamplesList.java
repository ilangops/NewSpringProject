package samples;

import java.util.*;

public class CollectionsExamplesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		ArrayList<Integer> values=new ArrayList<>();
		values.add(10);
		values.add(20);
		values.add(13);
		values.add(0,9);
		
		//values.remove(0);
		//System.out.println(values.get(0));
		Iterator<Integer> itr=values.iterator();
		while (itr.hasNext())
			System.out.print(itr.next()+ "_");
		for(int k : values)
		{
			System.out.println(k);	
		}
		System.out.println(values);
		//System.out.println(values.remove(values.indexOf(56)));
		//System.out.println(values);
		}

}