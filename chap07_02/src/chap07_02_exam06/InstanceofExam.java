package chap07_02_exam06;

class Parent {}

class Child extends Parent{}

public class InstanceofExam {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child타입으로 변환 성공");
		}
		else {
			System.out.println("method1 - Child타입으로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
