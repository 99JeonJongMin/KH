package TEST;

public class thr extends Thread {
	int num;
	int count = 100;
	int time;
	public thr (int num,int time) {
		this.num = num;
		this.time = time;
	}
	public void run() {
		try {
			for(int i =1; i<=4; i++) {
			System.out.println("Thread"+num+" : "+count);
			count+=1;
			thr.sleep(time);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}


		System.out.println("================");
	}
}
