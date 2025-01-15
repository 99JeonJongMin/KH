package chap06.exam;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		
		for(int i =0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
		for(int i =0; i<oldArray.length; i++) {
			System.out.println("oldArray["+i+"] = "+oldArray[i]);
		}
		System.out.println();
		for(int i =0; i<newArray.length; i++) {
			System.out.println("newArray["+i+"] = "+newArray[i]);
		}
	}

}
