package chap09.sec02.test;

import java.security.PublicKey;

public class Anonymous {
	Worker field = new Worker() {
		public void start() {
			System.out.println("쉬고 있습니다.");
		}
	};
	
	void method1() {
		Worker localVarWorker = new Worker() {
			public void start() {
				System.out.println("개발을 합니다.");
			}

		};

		localVarWorker.start();		
	
	}
	
	void method2(Worker worker) {
		worker.start();
		
	}
	
}
