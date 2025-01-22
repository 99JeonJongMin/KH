package chap10_test;

public class Test {
	public static void main(String[] args) {
		String[] strArray = {"10","a20"};
		
		int value = 0;
		for(int i =0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
				// TODO: handle exception
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
				
			} finally {
				System.out.println(value);
			}
		}
	}
}
