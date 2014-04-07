auto myFunct(){				//return type: animal
	Animal a = new Animal();
	Mammal m = new Mammal();
	...
	if(condition){
		return a;
	}
	else{
		return m;
	}
	...
}
