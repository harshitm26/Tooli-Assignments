package AdministrativeUnit;
import ZooStructure.*;
import Animals.*;

public class Service extends AdminAnimal{
	public Service(){
		super();
		super.name = "Service";
	}
public void cleanCages(Cages c){
		System.out.println(c.getName() + " is clened");
	}
	public void washAnimals(Animals a){
		System.out.println(a.getName() + " is cleaned");
	}
}
