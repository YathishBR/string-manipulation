package string_Concepts;

public class Immutable_String {

	public static void main(String[] args) {
		String s="Sachin";  
		System.out.println("before doing concat function s: "+s);
		System.out.println();
		String s1=s.concat(" Tendulkar");  

		System.out.println("After doing concat function s1: "+s1);
		System.out.println();
		System.out.println("After doing concat function s: "+s);
		System.out.println();
		String  s2=s.concat(" Tendulkar"); 
		System.out.println("new String formed after concation  with s2: "+s2); 
		String  s3=s1.concat(" Tendulkar"); 
		System.out.println();
		System.out.println("new String formed after concation  with s1: "+s3);

	}

}
