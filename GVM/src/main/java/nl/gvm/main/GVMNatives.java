package nl.gvm.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GVMNatives {

	public static void printStdOut(String message) {
		System.out.println(message);
	}

	public static void printStdErr(String message) {
		System.err.println(message);
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
