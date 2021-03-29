package by.tymanuan.task1.action.stream;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortingArrayElementStreamTest {

	SortingArrayElementStream sort;
	ArrayInteger array;

	@BeforeClass
	public void setUp() {
		sort = new SortingArrayElementStream();
	}

	@BeforeMethod
	public void setUpBeforeMethod() {
		array = new ArrayInteger(new int[] { 10, 15, 7, -5, 0, 4, 69, -10 });
	}

	@Test
	public void sortArrayElementTest() throws ArrayIntegerException {
		sort.sortArrayElement(array);
		int[] expected = { -10, -5, 0, 4, 7, 10, 15, 69 };
		int[] actual = array.getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void sortArrayElementExceptionTest() throws ArrayIntegerException {
		sort.sortArrayElement(null);
	}
}
