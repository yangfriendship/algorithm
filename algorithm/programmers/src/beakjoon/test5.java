package beakjoon;

class Person{
	private static int age;
	int number =0;
	
	public static int getAge() {
		return age;
	}


	public static void setAge(int age) {
		Person.age = age;
	}


	public static void printAge() {
		System.out.println();
	}
}
public class test5 {
	

	
	public static void main(String[] args) {

		Person ps = new Person();
		ps.setAge(10);
		ps.printAge();
		
		
	}//main
}
