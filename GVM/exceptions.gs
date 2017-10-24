if(true){}
try{
	print("inside try");
	if(a){}
} catch( e) {
	try{
		if(1/0){}
	} catch( e )
	{
		print("And the inner exception is: ");
		print( e );
	}
	print("And the exception is: ");
	print(e);
}
print("outside try");

s = function(a)
{
	try{
		print(a);
		1/0;
	} catch(e)
	{
		print("catch block within function called");
	};
	1/0;
	print("Should not be called");
	return;
}
try{
	s("trying real hard");
} catch( e2) 
{
	print("Exception handler outside function");
	print(e2);
}
print("And, we are done!");