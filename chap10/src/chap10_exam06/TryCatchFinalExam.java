package chap10_exam06;

public class TryCatchFinalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) { //Exception e 상위클래스로 예외처리가능
			System.out.println("클래스가 존재하지 않습니다.");
			// TODO: handle exception
		}
	}

}
