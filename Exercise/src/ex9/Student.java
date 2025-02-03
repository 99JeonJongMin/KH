package ex9;

public class Student {
	String name;
	String addr;
	String tel;
	
	public Student(String name, String addr, String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	
	public Student() {}
	
	public void menu() {
		System.out.println("*** 메뉴 ***");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 조회");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 종료");
	}
}
