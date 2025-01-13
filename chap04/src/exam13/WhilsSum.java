package exam13;

public class WhilsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1에서부터 "+(i-1)+"의 값은 "+sum);
	}

}
