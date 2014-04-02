package Visitors;
import Animals.*;


public class MovieMakers extends Visitors{
	public MovieMakers(){
		super();
		super.name = "MovieMakers";
	}
	public MovieMakers(String name){
		super();
		super.name = name;
	}
	public void doShooting(Animals a){
		System.out.println("Make movie of " + a.getName());
	}
}
