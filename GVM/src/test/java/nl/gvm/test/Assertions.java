package nl.gvm.test;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;

public class Assertions {
	
	static Set<String> failures = new HashSet<>();

	public static void fail(String message) {
		failures.add(message);
	}
	
	public static void failFailures() {
		if(!failures.isEmpty()) {
			Assert.fail(failures.toString());
		}
	}
	
}
