package chap09.sec02.test2;

public class Anonymous {
	
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	public Anonymous() {
		// TODO Auto-generated constructor stub
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
