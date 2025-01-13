package test;

public class test03 {
	public static void main(String[] args) {
		
		
		boolean check = true;
		
		while(check) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			if(num1+num2==5) {
				check = false;
			}
			
			System.out.println(num1+","+num2);
		}
			
	}
}
