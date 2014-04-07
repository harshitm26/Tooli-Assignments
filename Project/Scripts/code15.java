auto sum(int i) {
  if (i == 1)
    return sum(i-1)+i;          
  else
    return i; 
}
