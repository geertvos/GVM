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
  
### To be supported: ###
* Named return values
* Full static method wrapping
* Full native object wrapping
* Multi threading

