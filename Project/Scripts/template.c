template <class T> auto g(T t); // forward declaration
template <class T> auto g(T t) { return t; } // return type is deduced at instantiation time
template <class T> auto g(T t); // redeclaration
