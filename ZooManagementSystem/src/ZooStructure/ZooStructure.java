package ZooStructure;

import Human.*;

public class ZooStructure {
	String name;
	public ZooStructure(){
		this.name = null;
	}
	public ZooStructure(String name){
		this.name = name;
	}
	public boolean checkEntry(Human h){
		System.out.println("Entry allowed");
		return true;
	}
	public String getName(){
		return name;
	}
}
