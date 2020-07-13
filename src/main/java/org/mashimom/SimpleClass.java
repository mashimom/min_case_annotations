package org.mashimom;

import org.jetbrains.annotations.NotNull;

public class SimpleClass {

	public static int count(@NotNull String s) {
		System.out.println(s); //only to have a first usage that would not throw NPE
		return s.length();
	}
}
