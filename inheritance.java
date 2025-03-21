package task;
class Animal {
	void sound() {
		System.out.println("makes sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("dogs barks");
	}
}
public class Inheritance {
public static void main(String[] args) {
	Dog d1= new Dog();
	Animal a1= new Animal();
	d1.sound();
	a1.sound();
}
}
