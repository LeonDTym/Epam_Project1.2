package by.tymanuan.task1.action.stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.exception.ArrayIntegerException;

public class ArifmeticFunctionStream {

	public static Logger Logger = LogManager.getLogger();

	public int searchMinValueArray(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		IntStream streamArrayInteger = IntStream.of(array.getArray());

		OptionalInt minValue = streamArrayInteger.min();

		Logger.log(Level.INFO, "minValue is " + minValue.getAsInt());

		return minValue.getAsInt();
	}

	public int searchMaxValueArray(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException();
		}

		IntStream streamArrayInteger = IntStream.of(array.getArray());

		OptionalInt maxValue = streamArrayInteger.max();

		Logger.log(Level.INFO, "maxValue is " + maxValue.getAsInt());

		return maxValue.getAsInt();
	}

	public int calculateAmountArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		IntStream streamArrayInteger = IntStream.of(array.getArray());

		int amountArrayElement = streamArrayInteger.sum();

		Logger.log(Level.INFO, "amountArrayElement is " + amountArrayElement);

		return amountArrayElement;
	}

	public double calculateAverageArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		IntStream streamArrayInteger = IntStream.of(array.getArray());

		OptionalDouble averageArrayElement = streamArrayInteger.average();

		Logger.log(Level.INFO, "averageArrayElement is " + averageArrayElement.getAsDouble());

		return averageArrayElement.getAsDouble();
	}

	public int calculateNumberPozitiveArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException("argument is null");
		}

		IntStream streamArrayInteger = IntStream.of(array.getArray());
		int numberPozitiveArrayElement = (int) streamArrayInteger.filter(i -> i > 0).count();

		Logger.log(Level.INFO, "numberPozitiveArrayElement is " + numberPozitiveArrayElement);

		return numberPozitiveArrayElement;
	}

	public int calculateNumberNegativeArrayElement(ArrayInteger array) throws ArrayIntegerException {

		if (array == null) {
			throw new ArrayIntegerException();
		}

		IntStream streamArrayInteger = IntStream.of(array.getArray());
		int numberNegativeArrayElement = (int) streamArrayInteger.filter(i -> i < 0).count();

		Logger.log(Level.INFO, "numberNegativeArrayElement is " + numberNegativeArrayElement);

		return numberNegativeArrayElement;
	}
}
