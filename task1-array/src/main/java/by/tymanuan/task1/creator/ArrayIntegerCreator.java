package by.tymanuan.task1.creator;

import java.io.File;
import java.io.IOException;
import java.util.List;

import by.tymanuan.task1.entity.ArrayInteger;
import by.tymanuan.task1.reader.DataReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.tymanuan.task1.exception.ArrayIntegerException;
import by.tymanuan.task1.parser.DataParser;

public class ArrayIntegerCreator {

	public static Logger Logger = LogManager.getLogger();

	public ArrayInteger fillRandomized(int sizeArray, int minValue, int maxValue) throws ArrayIntegerException {

		if (sizeArray < 0) {
			throw new ArrayIntegerException("size array is less then zero");
		}

		ArrayInteger array = new ArrayInteger(sizeArray);

		for (int numberElement = 0; numberElement < sizeArray; numberElement++) {

			int valueElement = (int) (Math.random() * (maxValue - minValue) + minValue);

			try {
				array.setElement(numberElement, valueElement);
			} catch (ArrayIntegerException e) {
				Logger.log(Level.ERROR, "exception impossible", e);
			}
		}

		Logger.log(Level.INFO, "object created: " + array.toString());

		return array;
	}

	public ArrayInteger createArrayIntegerFromFile(File file) throws ArrayIntegerException {

		DataReader dataReader = new DataReader();
		List<String> data;
		try {
			data = dataReader.takeAll(file);
		} catch (IOException e) {
			throw new ArrayIntegerException("Reader eror", e);
		}

		DataParser dataArrayParser = new DataParser();

		int[] arrayData = dataArrayParser.parse(data);

		if (arrayData == null) {
			throw new ArrayIntegerException("no data to create array");
		}

		ArrayInteger arrayInteger = new ArrayInteger(arrayData);

		Logger.log(Level.INFO, "object created: " + arrayInteger.toString());

		return arrayInteger;
	}
}
