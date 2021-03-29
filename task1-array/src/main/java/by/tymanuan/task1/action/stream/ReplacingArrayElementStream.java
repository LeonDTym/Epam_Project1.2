package by.tymanuan.task1.action.stream;

import java.util.stream.IntStream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;

public class ReplacingArrayElementStream {

	public static Logger Logger = LogManager.getLogger();

	public ArrayInteger replaceEvenNumber(ArrayInteger array, int replacementValue) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		Logger.log(Level.INFO,
				"need to replace all even numbers in array " + array.toString() + " with a number " + replacementValue);

		IntStream streamArrayInteger = IntStream.of(array.getArray());

		int[] arrayInteger = streamArrayInteger.map(i -> i % 2 == 0 ? replacementValue : i).toArray();

		for (int i = 0; i < arrayInteger.length; i++) {
			array.setElement(i, arrayInteger[i]);
		}

		Logger.log(Level.INFO, "array after replacement " + array.toString());

		return array;
	}

	public ArrayInteger replaceNegativeElementWithZero(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException();
		}

		Logger.log(Level.INFO, "need to replace all negative numbers in array " + array.toString() + " with zero ");

		IntStream streamArrayInteger = IntStream.of(array.getArray());

		int[] arrayInteger = streamArrayInteger.map(i -> i < 0 ? 0 : i).toArray();

		for (int i = 0; i < arrayInteger.length; i++) {
			array.setElement(i, arrayInteger[i]);
		}

		Logger.log(Level.INFO, "array after replacement " + array.toString());

		return array;
	}
}
