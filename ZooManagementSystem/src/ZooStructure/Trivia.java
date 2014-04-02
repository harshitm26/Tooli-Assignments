package ZooStructure;
import Visitors.*;


public class Trivia extends Stalls{
	public Trivia(){
		super();
	}
	public Trivia(String name){
		super();
		super.name = name;
	}
	public void sell(Visitors v){
		System.out.println("Sell Trivia to " + v.getName());
	}
}
