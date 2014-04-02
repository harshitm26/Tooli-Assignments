package ZooStructure;
import AdministrativeUnit.*;
import Human.*;

public class SecurityBuilding extends AdminBuilding {
	public SecurityBuilding(){
		super();
		super.name = "SecurityBuilding";
	}
	public boolean checkEntry(Human h){
		if(h.getClass().equals(Security.class)){
			System.out.println("Entry Allowed");
			return true;
		}
		else{
			System.out.println("Entry restricted");
			return false;
		}
	}
}
