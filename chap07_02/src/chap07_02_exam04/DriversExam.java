package chap07_02_exam04;

public class DriversExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle ve = new Bus();

		driver.drive(bus); //매개변수로 Vehicle형을 줘야 하지만 그 자식인 bus가 자동으로 Vehicle형으로 형변환 되어서 매개변수로 들어감
		driver.drive(taxi);//이후 부모메소드의 drive가 아닌 오버라이드가 된 자식들의 drive메소드가 우선적으로 실행되게 된다.
		driver.drive(ve);
		
	}

}
