package Animals;
import ZooStructure.Cages;
import Interface.*;

public class Lion extends Carnivores implements Reproduce, Run, Eat{
	public Lion(){
		super.name = "Lion";
		super.setCages(new Cages());
	}
	public Lion(String name, Cages c){
		super.name = this.name;
		super.setCages(c);
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
