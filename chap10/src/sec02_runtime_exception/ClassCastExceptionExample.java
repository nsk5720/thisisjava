package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);			//10행 주석달면 에러 안나옴      animal밑에 dog와 cat끼리는 형변환 에러

	}
	public static void changeDog(Animal animal) {
		// ClassCastException 발생 가능
		Dog dog = (Dog) animal;
	}

}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}