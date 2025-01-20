package chap07_02_exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i =1; i<=20; i++) {
			int problemLocation = car.run();
		
//		switch(problemLocation) {
//		case 1:
//			System.out.println("앞왼쪽 HankookTire로 교체");
//			car.frontLeft = new HankookTire("앞왼쪽",15);
//			break;
//		case 2:
//			System.out.println("앞오른쪽 HankookTire로 교체");
//			car.frontRight = new KumhoTire("앞오른쪽",13);
//			break;
//		case 3:
//			System.out.println("뒤왼쪽 HankookTire로 교체");
//			car.backLeft = new HankookTire("뒤왼쪽",14);
//			break;
//		case 4:
//			System.out.println("뒤오른쪽 KumhoTire로 교체");
//			car.backRight = new HankookTire("뒤오른쪽",17);
//			break;
//		}
		
		if(problemLocation == 1) {
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeft = new HankookTire("앞왼쪽",15);
		}
		if(problemLocation == 2) {
			System.out.println("앞오른쪽 HankookTire로 교체");
			car.frontRight = new KumhoTire("앞오른쪽",13);
		}if(problemLocation == 3) {
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.backLeft = new HankookTire("뒤왼쪽",14);
		}if(problemLocation == 4) {
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			car.backRight = new HankookTire("뒤오른쪽",17);
		}
		System.out.println();
		System.out.println("-------------------");
	}

}
	
}
