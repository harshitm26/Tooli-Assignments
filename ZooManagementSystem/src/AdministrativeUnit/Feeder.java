package AdministrativeUnit;

import Animals.*;

public class Feeder extends AdminAnimal {
	public Feeder(){
		super();
		super.name = "Feeder";
	}
	public void feedAnimals(Animals a){
		System.out.println("Feed animal " + a.getName());
	}
	
}
