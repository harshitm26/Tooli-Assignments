package Animals;
import ZooStructure.*;


public class Carnivores extends Animals{
	String name;
	public Carnivores(){
		super();
		super.name = null;
	}
	
	public Carnivores(String name, Cages c){
		super();
		super.name = name;
		super.c = c;
	}
	
	public void eat(){
		System.out.print(super.name + " Eat Meat");
	}
	public void setCages(Cages c){
		super.c = c;
	}
}
