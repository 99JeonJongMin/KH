package chap06.exam;

public class ArrayCopyMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldArray = {"java","array","copy"};
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 1, newArray, 0, 1); // 원본배열,카피할 배열의 시작인덱스, 카피받을 배열, 카피받을 배열의 시작인덱스, 갯수)
		
		for(int i =0; i<newArray.length; i++) {
			System.out.println("newArray["+i+"] = "+newArray[i]);
		}
	}

}
