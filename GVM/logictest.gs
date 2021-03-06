//Wrapping an special class to report failures
assertFail = function(msg) {
	native("nl.gvm.test.Assertions","fail", msg);
}

print("This is a funky unit test that uses the GVM to test the GVM.");

var test = function(expression, message) {
	if (expression) {
		print(message+" works.");
	} else {
		print(message+" fails!");
		assertFail(message);
	}
	return;
};

test( true , "const true");
test( !false, "operator !");
test( 1<2 , "operator <");
test( 3>2 , "operator >");
test( 3>=2 , "operator >=");
test( 1<=2 , "operator =>");
test( 2==2 , "operator ==");
test( 3!=2 , "operator !=");
test( 1+1==2 , "operator +");
test( 3-1==2 , "operator -");
test( 2*2==4 , "operator *");
test( 2*2-1==3 , "operator precedence");
test( "a"=="a" , "operator ==");
test( "a"+"b"=="ab" , "String String concat");
test( "a"+1 == "a1" , "String Number concat");
test( 1+"a" == "1a" , "Number String concat");

//To be implemented
//test( "a"+true == "atrue" , "String Boolean concat");

try {
 	var s = 1/0;
	assertFail("Division by zero not caught.");
} catch(e) {
	print("Exceptions work, caught a: "+e);
}
print("Test Suite completed.");
