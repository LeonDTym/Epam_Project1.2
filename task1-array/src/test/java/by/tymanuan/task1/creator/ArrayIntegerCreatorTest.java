package by.tymanuan.task1.creator;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.tymanuan.task1.exception.ArrayIntegerException;

public class ArrayIntegerCreatorTest {

	ArrayIntegerCreator creator;
	File file;

	@BeforeClass
	public void setUp() {
		creator = new ArrayIntegerCreator();
		file = new File("resources/data.txt");
	}

	@Test
	public void createArrayIntegerFromFileTest() throws ArrayIntegerException, IOException {
		int[] expected = new int[] { 2, 10, 18, 36 };
		int[] actual = creator.createArrayIntegerFromFile(file).getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void createArrayIntegerFromFileExceptionTest() throws ArrayIntegerException, IOException {
		creator.createArrayIntegerFromFile(null);
	}
	
	@AfterClass
	public void tierDown() {
		creator = null;
		file = null;
	}
}
