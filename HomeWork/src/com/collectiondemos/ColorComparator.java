package com.collectiondemos;

import java.util.Comparator;

public class ColorComparator implements Comparator<CarComparable> {

	@Override
	public int compare(CarComparable o1, CarComparable o2) {
		return o1.color.compareTo(o2.color);
	}

}
