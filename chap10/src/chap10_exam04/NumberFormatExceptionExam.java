package chap10_exam04;

public class NumberFormatExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "100";
		String data2 = "a100"; //a때문에 parseInt가 안먹음
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1+" + " +data2 + "="+result);
	}

}
