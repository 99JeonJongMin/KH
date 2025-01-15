package chap06.exam;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		
		for(int score : scores) { // score 라는 변수를 만들고 scores라는 배열의 [0]부터 길이까지 넣어주는것을 반복한다. = score는 기존 for문의 scores[i]랑 동일함
			sum+=score;
		}
		System.out.println("점수 총합 = "+sum);
		
		double avg = (double) sum/scores.length;
		System.out.println("점수 평균 = "+avg);
	}

}
