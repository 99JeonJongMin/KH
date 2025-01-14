package ex1;

public class exam05 {
//	문제5. for 반복문을 사용하여 아래 출력예와 같이 자바프로그램을 작성하여 보시오.
//	- 출력예 -
//	1부터 10까지의 홀수의 곱은 945입니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		
		for(int i =1; i<=10; i++) {
			
			if(i % 2 !=0) {
				x*=i;
			}
		}
		System.out.println("1부터 10까지의 홀수의 곱은 "+x+"입니다.");
	}

}
