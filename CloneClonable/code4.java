public class Animal implements Cloneable{
	public Animal clone() throws CloneNotSupportedException{
		return (Animal) super.clone();
	}
}

public class Dog extends Animal implements Cloneable{
	public Dog clone(){
		return (Dog) super.clone();
	}
}
