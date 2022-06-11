package learncollection;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {

		Set<Integer> obj= new TreeSet<Integer>();
		
		obj.add(123);
		obj.add(234);
		obj.add(345);
		obj.add(456);
		obj.add(567);
		obj.add(357);
		obj.add(159);
		
		System.out.println(obj);
		
		System.out.println();
		
		//count
		System.out.println(obj.size());
		
		System.out.println();
		//Print All items
		for(Integer eachObj:obj) {
			
			System.out.println(eachObj);
		}
		
		System.out.println();
		
		//remove one item
		obj.remove(456);
		
		//check after remove
		System.out.println(obj);
		
		System.out.println();
		//remove all items
		
		obj.clear();
		
		//check after remove all items
		System.out.println(obj.isEmpty());
		
		
		

	}



	}


