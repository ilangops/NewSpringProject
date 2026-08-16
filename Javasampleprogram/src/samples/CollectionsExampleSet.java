package samples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> values=new TreeSet <>();
		values.add(10);
		values.add(20);
		values.add(13);
		values.add(0);
		values.remove(0);
		//values.sort();
		//values.remove(0);
		//System.out.println(values.get(0));
		System.out.println(values.size());
		System.out.println(values);
	}

}
