package ZooStructure;
import Visitors.*;


public class SoverignShop extends Stalls{
	public SoverignShop(){
		super();
	}
	public SoverignShop(String name){
		super();
		super.name = name;
	}
	public void sell(Visitors v){
		System.out.println("Sell soverign to " + v.getName());
	}
}
