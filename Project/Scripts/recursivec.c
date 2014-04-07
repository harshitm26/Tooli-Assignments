auto h() { return h(); } // error, return type of h is unknown

auto sum(int i) {
  if (i == 1)
    return i;          // return type deduced to int
  else
    return sum(i-1)+i; // ok to call it now
}
