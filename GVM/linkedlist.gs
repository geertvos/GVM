

var list = function()
{
	
	Sentinel = function(){return this;}
	
	/*
         * Define an Add function to add new elements up front
         */
	add = function( v )
	{
		sentinel = new Sentinel();
		sentinel.next = first;
		sentinel.data = v;
		first = sentinel;
		return;
	};

	/*
         * Get element N from the list.
         */
	get = function(n)
	{
		var s = first;
		for( i=0;i<n;i=i+1)
		{
			if( s.next != undefined )
			{
				s=s.next;
			} else {
				return undefined;
			}
		}
		return s.data;
	}
	return this;
}

mylist = new list();
mylist.add("geert");
mylist.add("geert2");
print(mylist.get(0));
