package sec01.test;

public class SoundableExam {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		printSound(new Dog());
	}

}
