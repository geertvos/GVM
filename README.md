This is a very minimal compiler and interpreter for a Javascript like functional programming language that is called GScript. 

### Language support: ###

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

