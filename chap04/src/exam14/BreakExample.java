package exam14;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()* 6)+1;
			
			if(num<=4) {
				continue;
			}
			System.out.println(num);
			
			if(num==6) {
				break;
			}
			
		}
		System.out.println("프로그램종료");
	}

}
