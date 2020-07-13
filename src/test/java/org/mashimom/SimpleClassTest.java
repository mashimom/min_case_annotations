package org.mashimom;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleClassTest {

	@Test(expected = IllegalArgumentException.class)
	public void count() {
		SimpleClass.count(null);
	}
}
