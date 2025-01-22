package chap09.sec02;

public class AnonymousExam {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.wake(); //어나니 머스 객체의 field의 wake를 동작 > anony객체의 field(Person으로 만든 익명객체)의 wake 동작
		
		anony.method1();
		
		anony.method2( 		//void method2(Person person) 에서 매개변수로받는 Person을 익명으로 만들어서 매개변수로 보내는 기법 (자식클래스가 오버라이딩 하는것과 비슷하지만 자식의 이름없이 익명으로 만듦)
				new Person() {
					void study() {
						System.out.println("공부 합니다.");
					}
					
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
				});
	}
}
