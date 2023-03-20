package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i:
             sourceList) {
            if (i % 2 == 0) {
                resultList.addLast(i);
            } else {
                resultList.addFirst(i);
            }
        }
        return resultList;
    }
}
