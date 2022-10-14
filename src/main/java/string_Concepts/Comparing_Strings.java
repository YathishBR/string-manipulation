package string_Concepts;
/*
 *Using equals() Method
 *Using == Operator
 *compareTo() Method
 * */
public class Comparing_Strings {

	public static void main(String[] args) {
		String s1="Yathish";
		String s2="yathish";
		String s3 = new String ("Yathish");
		String s4="Yathish";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s4.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		

	}

}
