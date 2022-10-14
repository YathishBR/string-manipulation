package string_Concepts;
/*
 * using different methods present inside String class*/
public class StringMethods {

	public static void main(String[] args) {
		String s ="this is yathish";
		char[] s1=s.toCharArray();
		for(int i=0;i<s1.length-1;i++)
		{
			System.out.println("Character at "+ i +" is  "+s1[i]);
		}
	
		System.out.println();
		System.out.println(s.toUpperCase());
		
		
		System.out.println();
		System.out.println(s.charAt(8));
		
		System.out.println(s.compareTo("yathish"));
		System.out.println(s.compareToIgnoreCase("THIS IS YATHISH"));
		
		System.out.println();
		String s2=s.concat("Gowda");
		System.out.println( s2);
		


	}

}
