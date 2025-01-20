package chap07_02_exam03;

public class Car {

	Tire frontLeft = new Tire("앞왼쪽", 6);
	Tire frontRight = new Tire("앞오른쪽", 4);
	Tire backLeft = new Tire("뒤왼쪽",3);
	Tire backRight = new Tire("뒤오른쪽",4);
	
	int status = 0;
	
	int run() {
		frontLeft.maxRotation--; System.out.println(frontLeft.maxRotation);
		frontRight.maxRotation--;
		backLeft.maxRotation--;
		backRight.maxRotation--;
		System.out.println(" [자동차가 달립니다 ]");
		if(frontLeft.roll()==false) {  status= 1; }
		if(frontRight.roll()==false) {  status=2;}
		if(backLeft.roll()==false) { status=3;}
		if(backRight.roll()==false) {status= 4;}
		
		if(status!=0) {
			stop();
			return status;
		}
		return 0;
	}

	void stop() {
		System.out.println(" [자동차가 멈춥니다 ]");
	}
}
