package by.tymanuan.task1.action.stream;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArifmeticServiceStreamTest {

	ArifmeticFunctionStream arifmeticFunction;
	ArrayInteger array;

	@BeforeClass
	public void setUp() {
		arifmeticFunction = new ArifmeticFunctionStream();
		array = new ArrayInteger(new int[] { 0, 15, 36, -58, 1, 7 });
	}

	@Test
	public void searchMinValueArrayTest() throws ArrayIntegerException {
		int expected = -58;
		int actual = arifmeticFunction.searchMinValueArray(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void searchMinValueArrayExceptionTest() throws ArrayIntegerException {
		arifmeticFunction.searchMinValueArray(null);
	}

	@Test
	public void searchMaxValueArrayTest() throws ArrayIntegerException {
		int expected = 36;
		int actual = arifmeticFunction.searchMaxValueArray(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void searchMaxValueArrayExceptionTest() throws ArrayIntegerException {
		arifmeticFunction.searchMaxValueArray(null);
	}

	@Test
	public void calculateAmountArrayElementTest() throws ArrayIntegerException {
		int expected = 1;
		int actual = arifmeticFunction.calculateAmountArrayElement(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateAmountArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticFunction.calculateAmountArrayElement(null);
	}

	@Test
	public void calculateAverageArrayElementTest() throws ArrayIntegerException {
		double expected = 0.16;
		double actual = arifmeticFunction.calculateAverageArrayElement(array);
		Assert.assertEquals(actual, expected, 0.01);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateMeanArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticFunction.calculateAverageArrayElement(null);
	}

	@Test
	public void calculateNumberPozitiveArrayElementTest() throws ArrayIntegerException {
		int expected = 4;
		int actual = arifmeticFunction.calculateNumberPozitiveArrayElement(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateNumberPozitiveArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticFunction.calculateNumberPozitiveArrayElement(null);
	}

	@Test
	public void calculateNumberNegativeArrayElementTest() throws ArrayIntegerException {
		int expected = 1;
		int actual = arifmeticFunction.calculateNumberNegativeArrayElement(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateNumberNegativeArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticFunction.calculateNumberNegativeArrayElement(null);
	}

	@AfterClass
	public void tierDown() {
		arifmeticFunction = null;
		array = null;
	}

}
