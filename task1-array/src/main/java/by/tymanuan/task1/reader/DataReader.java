package by.tymanuan.task1.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tymanuan.task1.exception.ArrayIntegerException;

public class DataReader {

	public List<String> takeAll(File file) throws ArrayIntegerException, IOException {

		if (file == null) {
			throw new ArrayIntegerException("file is null");
		}

		BufferedReader reader = new BufferedReader(new FileReader(file));
		List<String> data = new ArrayList<String>();
		String lineData = null;

		while ((lineData = reader.readLine()) != null) {
			if (!lineData.isEmpty()) {
				data.add(lineData);
			}
		}
		reader.close();

		return data;
	}
}
