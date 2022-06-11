package javaDemo;

public class WhileLoop {

	public static void main(String[] args) {
		//*below one way system
		int i= 1;
		while(i<=10) {
			System.out.println(i);
			i=i+2;
			//second way system
			//print all the value from below Arrays(obj) by using while loop
			String[]obj =new String[4];
			obj[0] ="Xyz";
			obj[1] = "Harun";
			obj[2] = "Mamun";
			obj[3]  ="Shipan";
			System.out.println(obj[i]);
			
			//by using loops we can perform various action 
			//for(int i=0;i<obj.length;i=i+1)
		
			
			
		}
	}

}
