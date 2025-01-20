package chap07_02_exam03;

public class Tire {
	public int maxRotation; //최대회전수
	public int accumulateRotation; //누적회전수
	public String location;


	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		if(maxRotation>0) {
			System.out.println(location + " Tire 수명 :" +(maxRotation)+ "회");
			return true;
		}
		else {
			System.out.println("*** "+ location + "Tire 펑크 ***");
			return false;
		}
	}
	
}

