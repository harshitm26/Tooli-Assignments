auto myFunct1(){			//return type: int
	...
	return myFunct2();
}

auto myFunct2(){			//return type: int
	...
	return myFunct3();
}

auto myFunct3(){			//return type: int
	int i;
	...
	if(condition){
		return myFunct1();
	}
	else{
		return i;
	}
}
