package sec02_exam02;

public class DriverExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		
		driver.drive(bus);
		driver.drive(new Taxi());
	}

}
