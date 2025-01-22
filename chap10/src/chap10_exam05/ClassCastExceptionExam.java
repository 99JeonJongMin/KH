package chap10_exam05;

public class ClassCastExceptionExam {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) { //예외발생방지
		Dog dog = (Dog) animal;
	}}
}