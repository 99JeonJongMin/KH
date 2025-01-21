package sec02_exam02;

public class DriverExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver(); //객체 생성
		
		Bus bus = new Bus();		 //구현객체 생성
		
		Vehicle vhehicle = new Bus(); //자동 형변환
		
		Bus bus1 = (Bus)vhehicle;
		
		driver.drive(bus);
		driver.drive(new Taxi());
		
		bus1.checkFare();
	}

}
