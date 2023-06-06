
public abstract class Abstraction {

	String name;
	int age;
	String Sound="nothing";
	abstract void makeSound();
	
	void show()
	{
		System.out.println(Sound);
	}
	
	public static void main(String[] args) {
	
		Abstraction a;
		a=new Dog();
		a.makeSound();
		a.show();
		a=new Cat();
		a.makeSound();
		a.show();

	}

}
class Dog extends Abstraction {

	String Dog_Sound="woof woof";
 	@Override
	void makeSound()
	{
		System.out.println("Sound made by Dog :-");
		super.Sound=Dog_Sound;
		
	}
}
class Cat extends Abstraction {

	String Cat_Sound="meow meow";
   	@Override
	void makeSound()
	{
   		System.out.println("Sound made by Cat :-");
	    super.Sound=Cat_Sound;
	}
}