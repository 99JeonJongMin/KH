package test;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		double count = 0;
		for(int i =0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
				count +=1;
			}
		
		}
		System.out.println(array.length);
		avg = sum / count;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
