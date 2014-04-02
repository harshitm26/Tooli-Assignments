package AdministrativeUnit;
import Visitors.*;


public class Ticket extends AdminPeople {
	public Ticket (){
		super();
		super.name = "Ticket";
	}
	public void giveTickets(Visitors v){
		System.out.println("Give tickets to " + v.getName());
	}
}
