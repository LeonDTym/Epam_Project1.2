package by.tymanuan.task1.action;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;

public class SortingArrayElement {

	public static Logger Logger = LogManager.getLogger();

	public ArrayInteger bubbleSortArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		Logger.log(Level.INFO, "need to sort by bubble array " + array.toString());

		int sizeArray = array.getSize();
		boolean needSorting = true;

		while (needSorting) {
			needSorting = false;

			for (int numberElement = 0; numberElement < sizeArray - 1; numberElement++) {

				if (array.getElement(numberElement) > array.getElement(numberElement + 1)) {
					swapArrayElement(array, numberElement, numberElement + 1);
					needSorting = true;
				}
			}
		}
		Logger.log(Level.INFO, "array after sorting " + array.toString());

		return array;
	}

	public ArrayInteger selectionSortArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		Logger.log(Level.INFO, "need to sort by selection array " + array.toString());

		int sizeArray = array.getSize();
		int numberMinElement;

		for (int numberElement = 0; numberElement < sizeArray; numberElement++) {
			numberMinElement = numberElement;

			for (int numberUnsortedElement = numberElement; numberUnsortedElement < sizeArray; numberUnsortedElement++) {

				if (array.getElement(numberUnsortedElement) < array.getElement(numberMinElement)) {
					numberMinElement = numberUnsortedElement;
				}
			}
			swapArrayElement(array, numberElement, numberMinElement);
		}
		Logger.log(Level.INFO, "array after sorting " + array.toString());

		return array;
	}

	public ArrayInteger insertionSortArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		Logger.log(Level.INFO, "need to sort by insertion array " + array.toString());

		int sizeArray = array.getSize();

		for (int numberElement = 0; numberElement < sizeArray; numberElement++) {
			int valueElement = array.getElement(numberElement);
			int numberSortedElement = numberElement - 1;

			while (numberSortedElement >= 0) {

				if (valueElement < array.getElement(numberSortedElement)) {
					array.setElement(numberSortedElement + 1, array.getElement(numberSortedElement));
					numberSortedElement--;
				} else {
					break;
				}
			}

			array.setElement(numberSortedElement + 1, valueElement);
		}

		Logger.log(Level.INFO, "array after sorting " + array.toString());

		return array;
	}

	public ArrayInteger swapArrayElement(ArrayInteger array, int numberElement1, int numberElement2)
			throws ArrayIntegerException {

		int buffer = array.getElement(numberElement1);
		array.setElement(numberElement1, array.getElement(numberElement2));
		array.setElement(numberElement2, buffer);

		return array;
	}
}
