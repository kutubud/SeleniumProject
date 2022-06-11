package learncollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.examples.ListLinks;

public class LearnList {

	public static void main(String[] args) {

 List<Integer> id=new ArrayList<Integer>();
id.add(20);
id.add(30);
id.add(25);
id.add(35);
id.add(40);
id.add(50);
      System.out.print(id);
      
      System.out.println(id.size());
      //for loop use here
      for(Integer eachId:id) {
    	  System.out.println(eachId);}
      
      //List True or False in below
      System.out.print(id.contains(55));
      
      System.out.print(id.contains(40));
      //clear the list
      id.clear();
      System.out.print(id.isEmpty());
      List<String> lst=new ArrayList<String>();
      lst.add("neepa");
      lst.add("mahbub");
      lst.add("mahbub");
      lst.add("xyz");
      lst.add("yousuf");
      lst.add("mamun");
      lst.add("neepa");
      //arraylist allow duplicate valu for that we have insert Neepa and mahbub multi[le time
      
      
      System.out.print(lst);
      //get of count of list
      System.out.print(lst.size());
      //add new item in the list
      lst.add("kutub");
      //after adding item
      System.out.print(lst);
      //after adding item get count of list
      System.out.print(lst.size());
      //print all iteam inside the list
      for(int i=0;i<lst.size();i++) {
    	  System.out.print(lst.get(i));
    	  //delet particular iteam from the list
    	  lst.remove(3);
    	  System.out.print(lst);
    	  //varing the particuler item in the list true or false
    	  System.out.print(lst.contains("Neepa"));
    	  System.out.print(lst.contains("Lemon"));
    	  System.out.print(lst.isEmpty());
    	  //List>linkList
    	  List<String> names=new LinkedList<String>();
    	  names.add("Wadud");
    	  names.add("Sumon");
    	  names.add("Touhid");
    	  names.add("Harun");
    	  names.add("Dolla");
    	  //Get the count
    	  System.out.print(lst.size());
    	  names.add("jony");
    	  System.out.print(names.size());
    	  //print all item inside the list
    	  for(String eachNames:names) {
    		  System.out.print("eachName");
    		  }
    	  //delete the item from the list
    	  names.remove(1);
    	  //again print all items inside the list
    	  for(String eachNames :names) {
    		  System.out.print(eachNames);}
    	  System.out.print(names.contains("Daisy"));
    	  names.clear();
    	  System.out.print(names.isEmpty());
    	  }
    	  }
    	  
    	  
    	  
    	  
      }
      
    
	


