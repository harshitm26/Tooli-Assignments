package ZooStructure;
import Visitors.*;


public class FoodStall extends Stalls{
	String name;
	public FoodStall(){
		super();
		this.name = null;
	}
	public FoodStall(String name){
		super();
		this.name = name;
	}
	public void sell(Visitors v){
		System.out.println("Sell edible to " + v.getName());
	}
	public String getName(){
		return this.name;
	}
}
