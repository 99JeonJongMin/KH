package ex3;

public class Calculator implements Calc,remain {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	public int remain(int num1, int num2) {
		return num1%num2;
	}

}
