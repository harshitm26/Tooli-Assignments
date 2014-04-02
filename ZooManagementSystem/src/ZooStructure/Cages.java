package ZooStructure;
import AdministrativeUnit.*;
import Human.Human;

public class Cages extends ZooStructure{
	boolean goodEnvironment;
	String name;
	public Cages(){
		super();
	}
	public Cages(String name){
		super();
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void keepClean(){
		System.out.println("Keep these clean");
	}
	public void suitableHabitat(SeasonalEnvironmentalist s){
		System.out.println(s.getName() + " provides suitable environment");
	}
	public boolean checkEntry(Human h){
		if(h.getClass().equals(AdminAnimal.class) || h.getClass().getSuperclass().equals(AdminAnimal.class)){
			System.out.println("Entry allowed");
			return true;
		}
		else{
			System.out.println("Entry Restrictred");
			return false;
		}
	}
	public void setEnvironment(boolean env){
		this.goodEnvironment = env;
	}
	public boolean getEnvironment(){
		return this.goodEnvironment;
	}
	
}
