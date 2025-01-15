package test;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,3,8,3};
		int max=array[0];
		
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	}

}
