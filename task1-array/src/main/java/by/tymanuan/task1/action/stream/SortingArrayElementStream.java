package by.tymanuan.task1.action.stream;

import java.util.stream.IntStream;

import by.tymanuan.task1.entity.ArrayInteger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.tymanuan.task1.exception.ArrayIntegerException;

public class SortingArrayElementStream {

	public static Logger Logger = LogManager.getLogger();

	public ArrayInteger sortArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		Logger.log(Level.INFO, "need to sort array " + array.toString());

		IntStream streamArrayInteger = IntStream.of(array.getArray());

		int[] arrayInteger = streamArrayInteger.sorted().toArray();

		for (int i = 0; i < arrayInteger.length; i++) {
			array.setElement(i, arrayInteger[i]);
		}

		Logger.log(Level.INFO, "array after sorting " + array.toString());

		return array;
	}
}
