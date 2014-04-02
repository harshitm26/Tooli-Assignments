package AdministrativeUnit;
import ZooStructure.*;


public class SeasonalEnvironmentalist extends AdminAnimal{
	public SeasonalEnvironmentalist(){
		super();
		super.name = "SeasonalEnvironmentalist";
	}
	public void setEnvironment(Cages c){
		if(c.getEnvironment()){
			System.out.println("Already conditioned environment for " + c.getName());
		}
		else{
			System.out.println("Environment conditioning done for " + c.getName());
			c.setEnvironment(true);
		}
	}
	
}
