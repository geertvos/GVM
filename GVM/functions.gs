

var list = function()
{
	print(this);
	add = function(a)
	{
		print(this);
		return;
	};

	get = function(a)
	{
		print(this);
		return;
	};

	return this;
}

mylist = new list();
mylist.add(1); //object3
mylist.get(1); //object2