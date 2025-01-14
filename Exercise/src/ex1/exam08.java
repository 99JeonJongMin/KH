package ex1;

public class exam08 {
//	문제8-2. 아래 출력예와 같이 출력하는 자바프로그램을 작성하시오.
//	- 출력예 -
//	****
//	 ***
//	  **
//	   *
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
