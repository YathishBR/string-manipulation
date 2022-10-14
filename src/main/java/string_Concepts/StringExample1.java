package string_Concepts;
/* Two ways to create String object
 * creating string by Java string literal 
 * creating Java string by new keyword 
 */
public class StringExample1 {

	public static void main(String[] args) {
		String s1="Welcome to Estuate"; //scpa area;
		String s2= new  String("Welcome to Estuate");//both heap and scpa
		String s3="Welcome to Estuate";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
