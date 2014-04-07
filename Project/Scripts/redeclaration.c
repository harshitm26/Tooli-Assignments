struct A {
  auto f(); // forward declaration
};
auto A::f() { return 42; }
