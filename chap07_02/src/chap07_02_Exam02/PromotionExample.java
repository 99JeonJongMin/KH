package chap07_02_Exam02;
class A {
	
}

class B extends A{}

class C extends A{}

class D extends B {}
class E extends B {}

class F extends C {}
class G extends C {}

public class PromotionExample {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A a1 = new B();
		A a2 = new C();
		A a3 = new F();
		
		B b = new B();
//		B b = new A(); 부모는 자동 형변환이 이뤄지지 않음
		a = b;
		A a4 = b; // A a4 = new B();
		A a5 = new B(); //위랑 동일
		b = (B)a; //강제 형변환
	}

}
