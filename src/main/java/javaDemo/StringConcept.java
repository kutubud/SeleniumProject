package javaDemo;

public class StringConcept {

	public static void main(String[] args) {
		
		String text = "String concept";
	    String text1 = "String concept";
	    //String text2 = "Football world cup";
	   

		System.out.println(System.identityHashCode(text));
		//System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text1));
		
		System.out.println(text);
		System.out.println(text1);
		
		System.out.println("...........................");
		
		
		//1.equals()- returns true/false
		System.out.println(text1.equals(text));
	
		//System.out.println(text.equals(text1));	
		
		
		//System.out.println("...............");
		
		System.out.println(text==text1);
	
		
		
		//2.Length() returns count of string with white space
		String text2 = "Football world cup";
		System.out.println(text2.length());
		System.out.println(text.length());
		
		
		//3. Concat()- add more than one string
		
		System.out.println(text.concat(text2).concat(text1));
		
		// if  concat different datatype variable, use +
		 String num = "50";
		 String num1 = "70";
		  int a = 30;
		  int b = 40;
		System.out.println(num+a);
		
		System.out.println(a+b);
		
		System.out.println(num+num1);
		
		//4. trim()- erase/remove begining/ending white space 
		String line ="   Java String concept   ";
		System.out.println(line);//print before trim
		System.out.println(line.length());//length before trim
		System.out.println(line.trim());//print after trim
		System.out.println(line.trim().length());//length after tirm
		//System.out.println(line.length());
		
		//5. toLowerCase()
		 String text4 = "Compares String and convert it Lower case";
		 System.out.println(text4.toLowerCase());
		 //to UpperCase()
		 System.out.println(text4.toUpperCase());
		 
		 //6.cotains()- return true/false
		 System.out.println(text4.contains("vert"));
		 System.out.println(text4.contains("text"));
		 System.out.println(text4.contains("String"));
		

	}


		
		

	}


