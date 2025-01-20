package chap07_02_exam03;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		if(maxRotation>0) {
			System.out.println(location + " HankookTire 수명 :" +(maxRotation)+ "회");
			return true;
		}
		else {
			System.out.println("*** "+ location + "HankookTire 펑크 ***  갈아끼운 타이어의 수명 : "+maxRotation);
			return false;
		}
	}
}
