package com.evergent.corejava.Strings;

import java.util.Arrays;

public class BasicStringProgram3 {

	public static void main(String[] args) {
		String name="JavaTechnologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf("T"));
		System.out.println("  java  ".strip());

	}

}
