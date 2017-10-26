print = function(text) {
	native("nl.gvm.main.GVMNatives","printStdOut",text);
	return;
}

printErr = function(text) {
	native("nl.gvm.main.GVMNatives","printStdErr",text);
	return;
}

readLine = function() {
	native("nl.gvm.main.GVMNatives","readString");
	return;
}

print("> Loaded system libs");
print("───────────────────────────────────────────");