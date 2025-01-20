package chap07_02_exam03;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		if(maxRotation>0) {
			System.out.println(location + " KumhoTire 수명 :" +(maxRotation)+ "회");
			return true;
		}
		else {
			System.out.println("*** "+ location + "KumhoTire 펑크 ***");
			return false;
		}
	}

}
