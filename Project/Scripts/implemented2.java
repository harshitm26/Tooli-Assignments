auato myFunction(){		// return type: int
	int i = 0;
	return i;
}

auto myFunction(){		//return type: double AFTER type coercsion
	int i = 1;
	int d = 2.2;
	if (condition){
		return i;		//return: int
	}
	else{
		reutn d;		//return: double
	}
}
