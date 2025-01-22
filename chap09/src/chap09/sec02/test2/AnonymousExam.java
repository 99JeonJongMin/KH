package chap09.sec02.test2;

import java.security.PublicKey;

public class AnonymousExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
			new Vehicle() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("트럭이 달립니다.");
				}
			});
				
			
			
	}}


