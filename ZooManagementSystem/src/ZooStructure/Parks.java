package ZooStructure;


public class Parks extends ZooStructure{
	String name;
	public Parks(){
		super();
		this.name = null;
	}
	public Parks(String name){
		super();
		this.name = name;
	}
	public void keepClean(){
		System.out.println("Keep " + name + " clean");
	}
	public String getName(){
		return this.name;
	}
	
}
