package chap09.sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() { //메소드 안에 로컬로 선언
		
		RemoteControl localVar = new RemoteControl() {
			
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}	
		void method2(RemoteControl rc) {
			rc.turnOn();
			rc.turnOff();
		}
	
}
