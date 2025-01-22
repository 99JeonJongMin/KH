package chap10_exam02;

public class ArrayIndexOutBoundsExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length == 2) {
		String data1 = args[0];
		String data2 = args[1];

		System.out.println("args[0] = "+args[0]);
		System.out.println("args[1] = "+args[1]);
	} else {
		System.out.println("두개의 실행 매개값이 필요합니다.");
	}

}}
