package by.tymanuan.task1.action;

import by.tymanuan.task1.entity.ArrayInteger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.tymanuan.task1.exception.ArrayIntegerException;

public class SortingArrayElementTest {

	SortingArrayElement sort;
	ArrayInteger array;

	@BeforeClass
	public void setUp() {
		sort = new SortingArrayElement();
	}

	@BeforeMethod
	public void setUpBeforeMethod() {
		array = new ArrayInteger(new int[] { 10, 15, 7, -5, 0, 4, 69, -10 });
	}

	@Test
	public void bubbleSortArrayElementTest() throws ArrayIntegerException {
		sort.bubbleSortArrayElement(array);
		int[] expected = { -10, -5, 0, 4, 7, 10, 15, 69 };
		int[] actual = array.getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void bubbleSortArrayElementExceptionTest() throws ArrayIntegerException {
		sort.bubbleSortArrayElement(null);
	}

	@Test
	public void selectionSortArrayElementTest() throws ArrayIntegerException {
		sort.selectionSortArrayElement(array);
		int[] expected = { -10, -5, 0, 4, 7, 10, 15, 69 };
		int[] actual = array.getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void selectionSortArrayElementExceptionTest() throws ArrayIntegerException {
		sort.selectionSortArrayElement(null);
	}

	@Test
	public void insertionSortArrayElementTest() throws ArrayIntegerException {
		sort.insertionSortArrayElement(array);
		int[] expected = { -10, -5, 0, 4, 7, 10, 15, 69 };
		int[] actual = array.getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void insertionSortArrayElementExceptionTest() throws ArrayIntegerException {
		sort.insertionSortArrayElement(null);
	}

	@AfterClass
	public void tierDown() {
		sort = null;
		array = null;
	}
}
