package AdministrativeUnit;

import Animals.*;

public class Doctor extends AdminAnimal {
	public Doctor(){
		super();
		super.name = "Doctor";
	}
	public Doctor(String name){
		super();
		super.name = name;
	}
	public void treatAnimal(Animals a){
		if(a.goodCondition()){
			System.out.println(a.getName() + " already well");
		}
		else{
			System.out.println(a.getName() + " treated");
			a.setCondition(true);
		}
	}
}
