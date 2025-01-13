package test;

public class test04 {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if( (4*x)+(5*y) == 60 ) {
					System.out.println("x의 값은 " + x + " y의 값은"+ y);
				}
			}
		}
	}
}
