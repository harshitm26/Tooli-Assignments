package Visitors;
import Animals.*;


public class AnimalRightActivist extends Visitors {
	public AnimalRightActivist(){
		super();
		super.name = "AnimalRightActivist";
	}
	
	public AnimalRightActivist(String name){
		super();
		super.name = name;
	}
	
	public String getName(){
		return super.name;
	}
	
	public void monitor(Animals a){
		System.out.println("Poor living conditions for " + a.getName());
	}
}
