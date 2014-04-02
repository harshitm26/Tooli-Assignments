package Animals;
import ZooStructure.Cages;
import Interface.*;

public class Elephant extends Herbivores implements Reproduce, Eat{
	public Elephant(){
		super.name = "Lion";
		super.c = new Cages();
	}
	public Elephant(String name, Cages c){
		super.name = this.name;
		super.c = c;
	}
	
	public void excrete(){
		System.out.println(super.name + " excretes");
	}
	public void run(){
		System.out.println(super.name + " runs");
	}
	public void walk(){
		System.out.println(super.name + " walks");
	}
	public void mate(){
		System.out.println(super.name + " mates");
	}
	public void offspring(){
		System.out.println(super.name + " gives birth to offsprings");
	}
}
