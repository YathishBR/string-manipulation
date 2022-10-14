package string_Concepts;
/*
 * overriding the methods present inside the object class*/
public class Student {
	String name;
	int id;
	String city;
	public Student(String name, int id, String city) {

		this.name = name;
		this.id = id;
		this.city = city;
	}
	@Override
	public String toString() {

		return ("I am "+name+" my id is "+id+" and i from "+city);
	}
	public static void main(String[] args) {
		Student s = new Student("yathish",13,"Bangalore");
		Student s1 = new Student("Ajay",16,"Mysore");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode()==s1.hashCode());

	}

}
