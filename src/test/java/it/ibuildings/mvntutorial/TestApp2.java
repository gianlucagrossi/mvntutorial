package it.ibuildings.mvntutorial;

import org.junit.Assert;
import org.junit.Test;

public class TestApp2 {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}
}
