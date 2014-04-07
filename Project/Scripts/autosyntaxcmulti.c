int i;
auto a = 1, *b = &i;	//ok 
auto x = 1, *y = &x;	//Valid assignment from left to right
auto c = 1, d=2.2; 		// Error type conflicts c:int; d:double;
