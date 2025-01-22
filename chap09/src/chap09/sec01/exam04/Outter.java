package chap09.sec01.exam04;

public class Outter {

	public void method2(int arg)  {//final생략
		
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		
		class Innner{
			public void method() {
				int rsult = arg + localVariable;
			}
		}
	}
}
