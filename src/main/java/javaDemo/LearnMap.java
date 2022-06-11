package javaDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> mp= new  LinkedHashMap<String,Integer>();

		
		mp.put("Mamun", 111);
		mp.put("Touhid", 123);
		mp.put("Daizy", 425);
		mp.put("Harun", 456);
		mp.put("xyz", 233);
		mp.put("Daizy", 775);
		mp.put("Kutub", 432);
		mp.put("xyz", 322);
		mp.put("Sumaiya", 653);
		for(Entry<String, Integer> eachMp:mp.entrySet()) {
			System.out.println(eachMp.getKey() +"  "+ eachMp.getValue());
	
		
		}
		
		System.out.println("....................");
		
		
		System.out.println(mp.size());
		
	
		
		
		mp.get("xyz");
		System.out.println(mp.get("xyz"));
		
		System.out.println(mp.containsValue(322));
		
		System.out.println(mp.containsKey("Harun"));
		
		
		mp.remove("Kutub");
		
		System.out.println("..............");
		
		
		System.out.println(mp.size());
		
		for(Entry<String, Integer>eachMp:mp.entrySet()) {
			System.out.println(eachMp.getKey() +"  "+ eachMp.getValue());}
		
		System.out.println("............");
		
		
		mp.containsKey("xyz");
		System.out.println(mp.containsKey("xyz"));
		
		System.out.println(".............");
		
		
		mp.containsValue(775);
		System.out.println(mp.containsValue(775));
		
		
		mp.clear();
		
		System.out.println(".............");
		
		System.out.println(mp.size());
		
		System.out.println("...............");
		
		System.out.println(mp.isEmpty());
		
		System.out.println("..............");
		
		for(Entry<String, Integer>eachmp:mp.entrySet()) {
			System.out.println(eachmp.getKey() +"  "+ eachmp.getValue());
			}
		
		

		
		
		
		
		
		
		
		
		
			

	}

}
