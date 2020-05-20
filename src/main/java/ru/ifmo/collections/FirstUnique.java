package ru.ifmo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {
    private TreeSet<Integer> whiteList = new TreeSet<>();
    private Set<Integer> blackList = new HashSet<>();

    public FirstUnique(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }

    public int showFirstUnique() {
        if (whiteList.size() != 0) {
            return whiteList.first();
        }
        return -1;
    }

    public void add(int value) {
        if (whiteList.contains(value)) {
            whiteList.remove(value);
            blackList.add(value);
        } else if (!multyInt.contains(value)) {
            whiteList.add(value);
        }
    }
}
