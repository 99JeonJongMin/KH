package chap07_02_exam01;

class Parents {
	public void method1 () {
		System.out.println("Parents Method1");
	}
	public void method2 () {
		System.out.println("Parents Method2");
	}
}

class Child extends Parents {
	@Override
	public void method2 () {
		System.out.println("Child Method2");
	}public void method3 () {
		System.out.println("Child Method3");
	}
}

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents parents = new Child();
		
//		Child child = new Parents();
		Child child = new Child();
		parents.method1();
		parents.method2();
//		parents.method3();
		
		child.method1();
		child.method2();
		child.method3();
	}

}
