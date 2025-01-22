package sec01.exam06;

public class SmartPhoneExam {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("구글", "안드로이드");
		
		String strObj = phone.toString();
		System.out.println(strObj);
		
		System.out.println(phone);
	}
}
