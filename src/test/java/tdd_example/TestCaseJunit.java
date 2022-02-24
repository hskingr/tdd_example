package tdd_example;

import static org.junit.Assert.*;

import org.junit.Test;

import xyz.hskr.main.Factorial;

public class TestCaseJunit {

	@Test
	public void test1() {
		Factorial myFactorial = new Factorial();
		assertEquals("Wrong answer, expected value is 5", 5, myFactorial.calculate(120));
	}

	public void test2() {
		Factorial myFactorial = new Factorial();
		assertEquals("Wrong answer, expected value is 6", 6, myFactorial.calculate(720));
	}

	public void test3() {
		Factorial myFactorial = new Factorial();
		assertEquals("Wrong answer, expected value is 7", 7, myFactorial.calculate(5040));
	}

}
