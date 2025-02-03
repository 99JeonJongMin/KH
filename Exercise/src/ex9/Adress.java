package ex9;

//문제. 주소록 정보를 ArrayList에 저장하고 검색할 수 있는 자바프로그램을 작성하시오.
//- 주소록 정보는 Adress라는 클래스로 나타내며, 이름, 주소, 전화번호 등의 필드를 가진다.
//- ArrayList의 입출력을 처리할 때 반복문을 사용하시오.
//- 주소록 정보를 추가, 조회, 삭제하는 간단한 메뉴를 출력하도록 작성하시오.

//=== 주소록 ===
//메뉴를 선택하세요.
//1. 추가 2. 삭제 3. 조회 4. 종료

public class Adress {
	String name;
	String addr;
	String tel;
	int age;
	
	
	public Adress() {}
	public Adress(String name, String addr, String tel,int age) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.age = age;
	}
	
	void menu() {
		System.out.println("=== 주소록 ===");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 추가 2. 삭제 3. 조회 4. 종료");
	}
}
