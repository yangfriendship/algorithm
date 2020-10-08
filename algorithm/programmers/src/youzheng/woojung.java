package youzheng;

class Person {
	
	private static int total = 0;
	private int age= 0;
	{
		total ++;
	}
	public void printTotal() {
		System.out.println(total);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getTotal() {
		
		return this.total;
	}
	public void descTotal() {
		this.total --;
	}
	
}

class population extends Person {
	
	private Person ps;
	
	public void delete() {
		this.ps= null;
		descTotal();
	}
	
	public void changeAge(int a) {
		super.setAge(a);
	}
	public void printAge() {
		System.out.println(super.getAge());
	}
	public population() {
		super();
	}
}

public class woojung {
	public static void main(String[] args) {

		population p1 = new population();
		System.out.println(p1.getAge());
		p1.setAge(10);
		System.out.println(p1.getAge());
		
		if(p1 instanceof Object) {
			System.out.println("ol");
		}
	}
}
