### GVM ###

The GVM is a small and efficient virtual machine that executes the GVM bytecode language. It is a stack based architecture.

The compiler and VM are fully written in Java and as a separate project, a fully working programming language is provided for educational purposes. See https://github.com/geertvos/gs-lang

### History ###
The source code of this project was written by Geert Vos around 2009. It was rediscovered later and imported into this GitHub repo.  

### Language features: ###

* Pluggable type system
* Basic arithmetic
* Objects
* Functions (first class citizens)
* Control flow (while, for, break, continue)
* Exception handling
* Native bridge
* Native callbacks
* Code execution inside existing context
* Multithreading (multiplexing on a single native thread, no support for blocking native calls)

### Building: ###

mvn clean install

java -jar ./target/gvm-0.0.1-SNAPSHOT-jar-with-dependencies.jar <file>


