package TEST;

public class threadtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread Thread0 = new thr(0,1000);
		Thread Thread1 = new thr(1,2000);
		Thread Thread2 = new thr(2,3000);
		
		try {
			Thread0.start();
			Thread0.join();
			Thread1.start();
			Thread1.join();
			Thread2.start();
			Thread2.join();
		} catch (Exception e) {}
		

	}

}
