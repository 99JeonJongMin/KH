package chap05.exam01;

public class StringEqulasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stVar1 ="신민철";
		String stVar2 ="신민철";
		
		if(stVar1==stVar2) {
			System.out.println("stVar1과 stVar2는 참조가 같음");
		}
		else {
			System.out.println("stVar1과 stVar2는 참조가 다름");
		}
		
		if(stVar1.equals(stVar2)) {
			System.out.println("stVar과 stVar2는 문자열이 같음");
		}
		
		String stVar3 = new String("신민철");
		String stVar4 = new String("신민철");
		
		if(stVar3==stVar4) {
			System.out.println("stVar3과 stVar4는 참조가 같음");
		}
		else {
			System.out.println("stVar3과 stVar4는 참조가 다름");
		}
		
		if(stVar3.equals(stVar2)) {
			System.out.println("stVar3과 stVar4는 문자열이 같음");
		}
		
		System.out.println("그 이유는 stVar3과 stVar4는 new 생성자로 객체를 새로 만들었기 때문에 문자열이 같더라도 참조하는 주소가 다르기 때문");
	}

}
