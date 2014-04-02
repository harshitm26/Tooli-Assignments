package ZooStructure;
import Visitors.*;

import Human.Human;

public class AdminBuilding extends ZooStructure {
	public AdminBuilding(){
		super();
	}

	public boolean checkEntry(Human h){
		if(h instanceof Visitors == true){
			System.out.println("Entry Restricted for " + h.getName());
			return false;
		}
		else{
			System.out.println("Entry allowed for  " + h.getName());
			return true;
		}
	}
	
}
