auto myFunct1(){		//compilation error: return type cannot be deduced
	...
	return myFunct2();
}

auto myFunct2(){
	...
	return myFunct3();
}

auto myFunct3(){
	...
	return myFunct1();
}
