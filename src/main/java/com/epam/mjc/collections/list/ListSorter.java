package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double aDouble = Math.pow(5 * Integer.parseInt(a), 2) + 3;
        double bDouble = Math.pow(5 * Integer.parseInt(b), 2) + 3;
        if (aDouble == bDouble) {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        }
        return Double.compare(aDouble, bDouble);
    }
}
