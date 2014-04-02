package Animals;
import Visitors.*;
import ZooStructure.*;

public class Animals {
	boolean goodCondition;
	String name;
	Cages c;
	public Animals(){
		this.goodCondition = true;
		this.c = null;
	}
	public Animals(Cages c){
		this.goodCondition = true;
		this.c = c;
	}
	
	public void entertain(Visitors v){
		System.out.println(name + " entertain " + v.getName());
	}
	
	public String getName(){
		return this.name;
	}
	public boolean goodCondition(){
		return this.goodCondition;
	}
	public void setCondition(boolean condition){
		this.goodCondition = condition;
	}
	public Cages getCage(){
		return c;
	}
}
