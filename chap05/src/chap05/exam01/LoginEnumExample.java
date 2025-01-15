package chap05.exam01;

public class LoginEnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginResult result = LoginResult.FAIL_PASSWORD;
		
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인에 성공하셨습니다.");
		}
		else if(result == LoginResult.FAIL_ID) {
			System.out.println("ID를 확인해주세요.");
		}
		
		else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("비밀번호를 확인해주세요.");
		}
	}

}
