package sec02_exam05;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impt = new ImplementationC();
		
		InterfaceA intA = impt;
		intA.methodA();
		System.out.println();
		
		
		InterfaceB intB = impt;
		intB.methodB();
		System.out.println();
		
		InterfaceC intC = impt;
		intC.methodA();
		intC.methodB();
		intC.methodC();
	}

}
