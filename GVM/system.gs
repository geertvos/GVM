print = function(text) {
	native("nl.gvm.main.GVMNatives","printStdOut",text);
	return;
}

printErr = function(text) {
	native("nl.gvm.main.GVMNatives","printStdErr",text);
}

readLine = function() {
	native("nl.gvm.main.GVMNatives","readString");
}

construct = function() {
	native("nl.gvm.main.GVMNatives","construct");
}

print("> Loaded system libs");
print("───────────────────────────────────────────");