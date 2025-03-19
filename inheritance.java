package oops;
/*class Animal{
	void sound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}
public class inheritance {
public static void main(String[] args) {
	Dog d1= new Dog();
	d1.sound();
	d1.bark();
	
}
}*/
//multilevel inheritance
/*class Animal{
	void sound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}

class puppy extends Dog{
	void weep() {
		System.out.println("puupy weeps");
	}
}
public class inheritance {
public static void main(String[] args) {
	puppy p1= new puppy();
	p1.sound();
	p1.bark();
	p1.weep();
}
}*/

//HERARICHAL CLASS
class Animal{
	void sound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("cat meows");
	}
	
}
public class inheritance{
public static void main(String[] args) {
	Dog dog= new Dog();
	Cat cat = new Cat();
	dog.sound();
	dog.bark();
	
	cat.sound();
	cat.meow();
	
}
}