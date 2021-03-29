package by.tymanuan.task1.action;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArifmeticServiceTest {

	ArifmeticService arifmeticService;
	ArrayInteger array;

	@BeforeClass
	public void setUp() {
		arifmeticService = new ArifmeticService();
		array = new ArrayInteger(new int[] { 0, 15, 36, -58, 1, 7 });
	}

	@Test
	public void searchMinValueArrayTest() throws ArrayIntegerException {
		int expected = -58;
		int actual = arifmeticService.searchMinValueArray(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void searchMinValueArrayExceptionTest() throws ArrayIntegerException {
		arifmeticService.searchMinValueArray(null);
	}

	@Test
	public void searchMaxValueArrayTest() throws ArrayIntegerException {
		int expected = 36;
		int actual = arifmeticService.searchMaxValueArray(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void searchMaxValueArrayExceptionTest() throws ArrayIntegerException {
		arifmeticService.searchMaxValueArray(null);
	}

	@Test
	public void calculateAmountArrayElementTest() throws ArrayIntegerException {
		int expected = 1;
		int actual = arifmeticService.calculateAmountArrayElement(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateAmountArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticService.calculateAmountArrayElement(null);
	}

	@Test
	public void calculateAverageArrayElementTest() throws ArrayIntegerException {
		double expected = 0.16;
		double actual = arifmeticService.calculateAverageArrayElement(array);
		Assert.assertEquals(actual, expected, 0.01);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateMeanArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticService.calculateAverageArrayElement(null);
	}

	@Test
	public void calculateNumberPozitiveArrayElementTest() throws ArrayIntegerException {
		int expected = 4;
		int actual = arifmeticService.calculateNumberPozitiveArrayElement(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateNumberPozitiveArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticService.calculateNumberPozitiveArrayElement(null);
	}

	@Test
	public void calculateNumberNegativeArrayElementTest() throws ArrayIntegerException {
		int expected = 1;
		int actual = arifmeticService.calculateNumberNegativeArrayElement(array);
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void calculateNumberNegativeArrayElementExceptionTest() throws ArrayIntegerException {
		arifmeticService.calculateNumberNegativeArrayElement(null);
	}

	@AfterClass
	public void tierDown() {
		arifmeticService = null;
		array = null;
	}

}
