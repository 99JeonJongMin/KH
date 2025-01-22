package chap09.sec02;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근 합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() { //메소드 안에서
		
		Person localVar = new Person() {
			void work() {
				System.out.println("산책 합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				work();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) { //매개변수로 Person 삽입
		person.wake();
	}
}	
