package nl.gvm.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import nl.gvm.core.GVMObject;
import nl.gvm.core.GVMPlainObject;

public class GVMNatives {

	static Random r = new Random(System.currentTimeMillis());
	
	public static void printStdOut(String message) {
		System.out.println(message);
	}

	public static void printStdErr(String message) {
		System.err.println(message);
	}
	
	public static int randomNumber() {
		return r.nextInt();
	}
	
	public static int randomNumberBound(Integer bound) {
		return r.nextInt(bound);
	}
	
	public static GVMObject construct() {
		return new GVMPlainObject();
	}

	public static String readString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String: ");
		try {
			String s = br.readLine();
			return s;
		} catch (IOException e) {
		}
		return null;
	}
}
