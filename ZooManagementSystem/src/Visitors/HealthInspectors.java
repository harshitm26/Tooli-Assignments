package Visitors;
import Animals.*;


public class HealthInspectors extends Visitors {
	public HealthInspectors(){
		super();
		super.name = "HealthInspector";
	}
	public void monitorCondition(Animals a){
		if(a.goodCondition()){
			System.out.println("Health conditions good for " + a.getName());
		}
		else{
			System.out.println("Health conditions bad for " + a.getName());
		}
	}
	public void writeReport(){
		System.out.println("Write Report");
	}
}
