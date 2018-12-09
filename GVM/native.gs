randomNumber = function() {
	native("nl.gvm.main.GVMNatives","randomNumber");
}

randomNumberBound = function(bound) {
	native("nl.gvm.main.GVMNatives","randomNumberBound", bound);
}

print("Hey this works!");
var s = readLine();
var o = construct();
o.text = "Hello "+s", you created "+o;
print(o.text);
if(s == "Geert") {
	print("Hello master!");
}
var random = randomNumber();
print("Random: "+random);
print("Random: "+randomNumber());
print("Random bound: "+randomNumberBound(10));
print("Length: "+s.length);
print("Reference: "+s.ref);
print("Lowercase: "+s.lowercase);