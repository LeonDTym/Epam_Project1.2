package by.tymanuan.task1.action;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArifmeticService {

	public static Logger Logger = LogManager.getLogger();

	public int searchMinValueArray(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		int minValue = 0;

		minValue = array.getElement(0);
		int sizeArray = array.getSize();

		for (int numberElement = 1; numberElement < sizeArray; numberElement++) {
			if (array.getElement(numberElement) < minValue) {
				minValue = array.getElement(numberElement);
			}
		}

		Logger.log(Level.INFO, "minValue is " + minValue);

		return minValue;
	}

	public int searchMaxValueArray(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException();
		}

		int maxValue = 0;

		maxValue = array.getElement(0);
		int sizeArray = array.getSize();

		for (int numberElement = 1; numberElement < sizeArray; numberElement++) {
			if (array.getElement(numberElement) > maxValue) {
				maxValue = array.getElement(numberElement);
			}
		}

		Logger.log(Level.INFO, "maxValue is " + maxValue);

		return maxValue;
	}

	public int calculateAmountArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		int amountArrayElement = 0;
		int sizeArray = array.getSize();

		for (int numberElement = 1; numberElement < sizeArray; numberElement++) {
			int arrayElement = array.getElement(numberElement);
			amountArrayElement += arrayElement;
		}

		Logger.log(Level.INFO, "amountArrayElement is " + amountArrayElement);

		return amountArrayElement;
	}

	public double calculateAverageArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		ArifmeticService arifmeticService = new ArifmeticService();
		int amountArrayElement = arifmeticService.calculateAmountArrayElement(array);
		double sizeArray = array.getSize();
		double averageArrayElement = amountArrayElement / sizeArray;

		Logger.log(Level.INFO, "averageArrayElement is " + averageArrayElement);

		return averageArrayElement;
	}

	public int calculateNumberPozitiveArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		int numberPozitiveArrayElement = 0;
		int sizeArray = array.getSize();

		for (int numberElement = 1; numberElement < sizeArray; numberElement++) {

			if (array.getElement(numberElement) > 0) {
				numberPozitiveArrayElement++;
			}
		}

		Logger.log(Level.INFO, "numberPozitiveArrayElement is " + numberPozitiveArrayElement);

		return numberPozitiveArrayElement;
	}

	public int calculateNumberNegativeArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException();
		}

		int numberNegativeArrayElement = 0;
		int sizeArray = array.getSize();

		for (int numberElement = 1; numberElement < sizeArray; numberElement++) {

			if (array.getElement(numberElement) < 0) {
				numberNegativeArrayElement++;
			}
		}

		Logger.log(Level.INFO, "numberNegativeArrayElement is " + numberNegativeArrayElement);

		return numberNegativeArrayElement;
	}
}
