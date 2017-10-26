print("This test shows if all basic arithmatic works,");

var test = function(expression, message) {
	if (expression) {
		print(message+" works.");
	} else {
		print(message+" fails!");
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
test( "a"=="a" , "operator ==");

try {
 	var s = 1/0;
	print("Exceptions fail.");
} catch(e) {
	print("Exceptions work, caught a: "+e);
}
print("string "+"concat works");

print("done");
