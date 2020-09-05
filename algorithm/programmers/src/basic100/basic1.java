package basic100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic1 {
	
	static List<Student> students = new ArrayList<>();
	public static class Student{
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		public Student(String name, int no) {
			super();
			this.name = name;
			this.no = no;
		}

		private String name;
		private int no;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
	}
	
	public static void init() {
		System.out.println("검색하시겠습니까?");
		Scanner sc = new Scanner(System.in); 
		String YorN = sc.next().toUpperCase().trim();
		if(YorN.trim().equals("N")) {
			System.out.println("Bye");
			return;
		}else if(YorN.equals("Y")) {
			searchByName();
			init();
		}else {
			init();
		}
	}
	
	public static void searchByName() {
		System.out.println("학생 이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int count = 0;
		for(Student item : students) {
			if (item.getName().equals(name)) {
				System.out.println("name : " + name + "no : " + item.getNo());
				return ;
			}else {
				count ++;
			}
			if(count==students.size()) {
				System.out.println("존재하지 않는 학생입니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		

		students.add(new Student("yuejiao",1));
		students.add(new Student("youzheng",2));
		students.add(new Student("zhongyi",3));
		students.add(new Student("shanjing",4));
		students.add(new Student("zonghe",5));
		
		init();
	}

}
