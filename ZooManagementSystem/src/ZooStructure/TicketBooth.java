package ZooStructure;
import AdministrativeUnit.*;
import Human.*;

public class TicketBooth extends AdminBuilding{
	public TicketBooth(){
		super();
		super.name = "TicketBooth";
	}
	public boolean checkEntry(Human h){
		if(h.getClass().equals(Ticket.class)){
			System.out.println("Entry allowed");
			return true;
		}
		else{
			System.out.println("Entry restricted");
			return false;
		}
	}
	
	
}
