package by.tymanuan.task1.action;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;

public class ReplacingArrayElement {

	public static Logger Logger = LogManager.getLogger();

	public ArrayInteger replaceEvenNumber(ArrayInteger array, int replacementValue) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		Logger.log(Level.INFO,
				"need to replace all even numbers in array " + array.toString() + " with a number " + replacementValue);

		int sizeArray = array.getSize();
		for (int numberElement = 0; numberElement < sizeArray; numberElement++) {
			if (array.getElement(numberElement) % 2 == 0) {
				array.setElement(numberElement, replacementValue);
			}
		}

		Logger.log(Level.INFO, "array after replacement " + array.toString());

		return array;
	}

	public ArrayInteger replaceNegativeElementWithZero(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException();
		}

		Logger.log(Level.INFO, "need to replace all negative numbers in array " + array.toString() + " with zero ");

		int sizeArray = array.getSize();
		for (int numberElement = 0; numberElement < sizeArray; numberElement++) {
			if (array.getElement(numberElement) < 0) {
				array.setElement(numberElement, 0);
			}
		}

		Logger.log(Level.INFO, "array after replacement " + array.toString());

		return array;
	}
}
