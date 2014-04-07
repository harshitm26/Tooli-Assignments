auto sum(int i) {	//allowed
  if (i == 1)
    return sum(i-1)+i;          
  else
    return i; 
}
