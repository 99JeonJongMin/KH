package chap09.sec02.exam02;

public class AnonymousExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn(); //Anonymous에 있는 field 는 RemoteControl을 구현한 구현객체 역할
		anony.field.turnOff();
		anony.method1();   	  //메소드 안에서 로컬로 선언
		
		anony.method2(		  //매개변수를 interface로 받는 method2에 매개변수로 익명구현객체로 구현 
				new RemoteControl() {
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
					}
				});
	}

}