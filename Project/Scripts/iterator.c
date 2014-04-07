void f(vector<double>& v)
{
	for (auto x : v) cout << x << '\n';
	for (auto& x : v) ++x;	// using a reference to allow us to change the value
	for (const auto x : { 1,2,3,5,8,13,21,34 }) cout << x << '\n';
}

