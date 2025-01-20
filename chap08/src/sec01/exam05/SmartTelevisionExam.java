package sec01.exam05;

public class SmartTelevisionExam {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(10);
		Searchable searchable = tv;
		searchable.search("http://www.google.com");
		tv.search("구글");
	}
}
