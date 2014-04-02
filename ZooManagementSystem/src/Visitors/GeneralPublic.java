package Visitors;
import Animals.*;
import ZooStructure.*;

public class GeneralPublic extends Visitors{
	public GeneralPublic(){
		super();
		super.name = "GeneralPublic";
	}
	public GeneralPublic(String name){
		super();
		super.name = name;
	}
	public void watchAnimals(Animals a){
		System.out.println("Watching animal " + a.getName());
	}
	public void doShopping(Stalls s){
		System.out.println(super.name + " purchase " + s.getName());
	}
	public void eat(FoodStall f){
		System.out.println(super.name + " eat " + f.getName());
	}
	public void playPark(Parks p){
		System.out.println(super.name + " play in " + p.getName());
	}
}
