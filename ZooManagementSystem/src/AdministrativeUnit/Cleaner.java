package AdministrativeUnit;


public class Cleaner extends AdministrativeUnit{
	public Cleaner(){
		super();
		super.name = "Cleaner";
	}
	public Cleaner(String name){
		super();
		super.name = name;
	}
	public void clean(){
		System.out.println(super.name + " clean the zoo");
	}
}
