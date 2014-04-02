package Visitors;
import Animals.*;


public class Media extends Visitors{
	public Media(){
		super();
		super.name = "Media";
	}
	public Media(String name){
		super();
		super.name = name;
	}
	public void takePictures(Animals a){
		System.out.println("Take Pictures of " + a.getName());
	}
	public void writeArticles(){
		System.out.println("Write Articles");
	}
}
