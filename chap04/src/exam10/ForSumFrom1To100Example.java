package exam10;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		int sums = 100;
		
		for(int i =1; i<=sums; i++) {
			sum += i;
		}
		
		System.out.println("1~100의 합은 "+sum);
	}

}
