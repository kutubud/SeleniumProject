package learncollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<Integer> obj= new TreeSet<Integer>();
		//Set<Integer> obj= new HashSet<Integer>();
		//Set<Integer> obj= new LinkedHashSet<Integer>();
		//1.add items in the set-use add()
		obj.add(124);
		obj.add(101);
		obj.add(125);
		obj.add(721);
		obj.add(123);
		obj.add(456);
		obj.add(101112);
		obj.add(789);
		obj.add(123);
		obj.add(000);
		obj.add(789);
		
		//get count of set
		System.out.println(obj.size());
		System.out.println(".............");
		//print or display all iteam in the set -use foreach loop
		for(Integer eachobj:obj) {
			System.out.println(eachobj);
			System.out.println("..........");
			//check particular iteam from set -use contain()-true or false
			System.out.println(obj.contains(101113));
			System.out.println(".............");
			//delet item from set-use remove item
			obj.remove(101113);
			System.out.println(obj.contains(101112));
			//remove all item from set
			obj.clear();
			//confirm set is empty or not
			System.out.println(obj.isEmpty());
			//after delet -print all item from set
			for(Integer eachInt:obj) {
				System.out.println(eachInt);
				System.out.println("..............");
				//after delet item
				System.out.println(obj.size());
				System.out.println("............");
				System.out.println(obj.contains(123));
				//remove all item from set
		
			}
		}

	}

}
