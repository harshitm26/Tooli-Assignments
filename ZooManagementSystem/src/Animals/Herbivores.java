package Animals;
import ZooStructure.*;

public class Herbivores extends Animals{
	String name;
	public Herbivores(){	
		super();
		super.name = null;
	}
	public Herbivores(String name, Cages c){
		super();
		super.name = name;
		super.c = c;
	}
	public void eat(){
		System.out.print(super.name + "Eat Plants");
	}
	public void setCages(Cages c){
		super.c = c;
	}
	
}
