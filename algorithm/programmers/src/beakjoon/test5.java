package beakjoon;

class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void print() {
		System.out.println("ok");
	}
}

public class test5 {

	public static void met(Person ps) {
		ps.setAge(100);
		ps.setName("¿ìÁ¤");
	}
	
	public void stringMet(String str) {
		str = str + "okok";
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		new Person().print();
//		Person.print();
		
		
		
	}
}
