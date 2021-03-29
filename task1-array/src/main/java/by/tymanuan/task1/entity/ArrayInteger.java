package by.tymanuan.task1.entity;

import java.util.Arrays;

import by.tymanuan.task1.exception.ArrayIntegerException;

public class ArrayInteger {

	private int[] array;

	public ArrayInteger(int[] array) {
		this.array = array;
	}

	public ArrayInteger(int size) throws ArrayIntegerException {
		if (size > 0) {
			array = new int[size];
		} else {
			throw new ArrayIntegerException("size array is less then zero");
		}
	}

	public int getSize() {
		return array.length;
	}

	public int getElement(int numberElement) throws ArrayIntegerException {
		if (numberElement >= 0 && numberElement < getSize()) {
			return array[numberElement];
		} else {
			throw new ArrayIntegerException("element with number" + numberElement + "doesn't exist");
		}
	}

	public void setElement(int numberElement, int value) throws ArrayIntegerException {
		if (numberElement >= 0 && numberElement < getSize()) {
			array[numberElement] = value;
		} else {
			throw new ArrayIntegerException("element with number" + numberElement + "doesn't exist");
		}
	}

	public int[] getArray() {
		return array;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayInteger other = (ArrayInteger) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (int i : array) {
			string.append(i + " ");
		}
		return string.toString();
	}

}