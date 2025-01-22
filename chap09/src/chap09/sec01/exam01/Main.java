package chap09.sec01.exam01;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A객체 생성
		A a = new A();
		System.out.println("------------------");
		System.out.println();
		
		//인스턴스 멤버 클래스 B객체 생성
		A.B b = a.new B();
		System.out.println("------------------");
		System.out.println();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 C객체 생성
		A.C c = new A.C();
		System.out.println("------------------");
		System.out.println();
		c.field = 3;
		c.method1();
		
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 > D객체 생성
		a.method();
		System.out.println("------------------");
		System.out.println();
	}	

}
