package sec01.exam04;

public class RemoteControlExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc; //인터페이스 변수
		rc = new Television(); //변수 = 구현객체(interface로 구현한 객체)
		rc = new Audio();
	}

}
