package by.tymanuan.task1.entity;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.tymanuan.task1.exception.ArrayIntegerException;

public class ArrayIntegerTest {

	ArrayInteger array;
	int[] mas;

	@BeforeClass
	public void setUp() {
		mas = new int[] { 0, 1, 2, 3, 4, 5 };
		array = new ArrayInteger(mas);
	}

	@Test
	public void getElementTest() throws ArrayIntegerException {
		int expected = 3;
		int actual = array.getElement(3);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void getElementExceptionTest() throws ArrayIntegerException {
		array.getElement(10);
	}

	@Test
	public void setElementTest() throws ArrayIntegerException {
		array.setElement(0, 1);
		int[] expected = { 1, 1, 2, 3, 4, 5 };
		int[] actual = array.getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void setElementExceptionTest() throws ArrayIntegerException {
		array.setElement(-3, 1);
	}

	@AfterClass
	public void tierDown() {
		mas = null;
		array = null;
	}
}
