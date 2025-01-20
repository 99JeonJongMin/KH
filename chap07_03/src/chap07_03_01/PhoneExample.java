package chap07_03_01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Phone phone = new Phone("홍길동"); 추상클래스로는 객체생성 X
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
	}

}
