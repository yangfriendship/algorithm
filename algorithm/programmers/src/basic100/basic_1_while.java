package basic100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import basic100.basic1.Student;

public class basic_1_while {
	
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
	
	public static void main(String[] args) {
		students.add(new Student("yuejiao",1));
		students.add(new Student("youzheng",2));
		students.add(new Student("zhongyi",3));
		students.add(new Student("shanjing",4));
		students.add(new Student("zonghe",5));
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색하시겠습니까? Y/N");
			String yn = sc.next().trim().toUpperCase();
			
			if(yn.equals("Y")) {
				System.out.println("학생이름을 입력하세요");
				String name = sc.next();
				int count = 0;
				boolean flag = false;
				for(Student item : students) {
					if(name.equals(item.getName())) {
						System.out.println(item.getNo());
						flag = true;
					}
					
				}
				if(!flag) System.out.println("존재하지않는 학생입니다");
			}
			
			else if(yn.equals("N")) {
				System.out.println("Bye");
				break;
			}
			
			
		}
		
		
	}


}
