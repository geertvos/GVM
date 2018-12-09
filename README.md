### GScript VM ###

This is a very minimal compiler and interpreter for a Javascript like functional programming language that is called GScript. 

The compiler and VM are fully written in Java and provide a working programming language and execution environment.

### History ###
The source code of this project was written by Geert Vos around 2009. It was rediscovered later and imported into this GitHub repo.  

### Language features: ###

* Primitives (String, Number, Boolean, Object and Function)
* Basic arithmetic
* Objects
* Functions (first class citizens)
* Multiple return values
* Control flow (while, for, break, continue)
* Exception handling
* Native method calling (static with String parameters only)

### Building: ###

mvn clean install

java -jar ./target/gvm-0.0.1-SNAPSHOT-jar-with-dependencies.jar <file>

### Code examples ###
The GVM runs GScript, a minimal Javascrip like language that looks like this:

```
print("Hello World!");
for( var i=0;i<1000000;i=i+1)
{
	print(i);
}
```

Object Oriented functional programming is supported, for each static function call a new object is created that represents the current this, this can be returned and so the function becomes a constructor.
```
var MyObject = function() {
 get = function() { return "GET" }
 return this;
}
var object = new MyObject();
print(object.get());
```

There is support for calling native Java methods from the scripting context.
```
myFunction = function(text) {
	native("nl.gvm.myfunctions.MyClass","myFunction",text);
	return;
}
var returnValue = myFucntion("input");
```

### To be supported: ###
* Named return values
* Full native object wrapping
* Multi threading

