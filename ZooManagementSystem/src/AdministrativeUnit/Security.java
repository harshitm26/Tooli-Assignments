package AdministrativeUnit;
import Visitors.*;
import Animals.*;

public class Security extends AdminPeople{
	public Security(){
		super();
		super.name = "Security";
	}
	public void luggageCheck(Visitors v){
		System.out.println("Luggage checked for "+ v.getName());
	}
	public void animalCheck(Animals a){
		System.out.println(a.getName() + " safe and secure");
	}
}
