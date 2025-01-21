package ex3_03;

public class Score implements ScoreTest {
	@Override
	public int sum(int kor, int eng, int mat) {
		
		return kor+eng+mat;
	}

	@Override
	public double avg(int sum) {
		
		return sum/3.0;
	}

}
