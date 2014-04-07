int foo();
auto x1 = foo(); // x1 : int
const auto& x2 = foo(); // x2 : const int&
auto& x3 = foo(); // x3 : int&: error, cannot bind a reference to a temporary
float& bar();
auto y1 = bar(); // y1 : ﬂoat
const auto& y2 = bar(); // y2 : const ﬂoat&
auto& y3 = bar(); // y3 : ﬂoat&
A* fii()
auto* z1 = fii(); // z1 : A*
auto z2 = fii(); // z2 : A*
auto* z3 = bar(); // error, bar does not return a pointer type
