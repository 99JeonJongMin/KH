package ex3_04;

public class CircleRadius implements CircleTest {

	@Override
	public double circumstance(double r) {
		return 2*PI*r;
	}

	@Override
	public double area(double r) {
		// TODO Auto-generated method stub
		return r*r*PI;
	}

}
