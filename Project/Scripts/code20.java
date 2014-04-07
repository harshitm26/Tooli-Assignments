auto myFunct1(){		//return type animal	
	...
	return myFunct2();
}

auto myFunct2(){		//return type animal
	Amoeba a = new Amoeba();
	...
	if(condition){
		return myFunct3();
	}
	else{
		return a;
	}
}

auto myFunct3(){		//return type animal
	Cat c = new Cat();
	...
	if(condition){
		return myFunct1();
	}
	else{
		return c;
	}
}
