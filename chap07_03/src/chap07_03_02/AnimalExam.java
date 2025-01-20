package chap07_03_02;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal animal = new Animal(); 추상 클래스는 생성자로 객체 생성 XX
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.sound();
		dog.sound();
		
		System.out.println("------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();
		
		System.out.println("----------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
