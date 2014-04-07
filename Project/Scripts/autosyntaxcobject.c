A foo();
A& bar();
...
A x1 = foo(); // x1 : A
auto x1 = foo(); // x1 : A
A& x2 = foo(); // error, we cannot bind a non−lvalue to a non−const reference
auto& x2 = foo(); // error
A y1 = bar(); // y1 : A
auto y1 = bar(); // y1 : A
A& y2 = bar(); // y2 : A&
auto& y2 = bar(); // y2 : A&
