package string_Concepts;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println("s1: "+s1);
		System.out.println(s1.append("Java"));
		System.out.println(s1.insert(0,"I love"));
		System.out.println(s1.delete(0, 2));
		System.out.println(s1.reverse());
		

	}

}
