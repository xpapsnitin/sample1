package com.corejava.practice;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(1, "One");
		tm.put(2, "Two");
		tm.put(3, "Three");
		tm.put(4, "Four");
		tm.put(5, "Five");

		for (Map.Entry<Integer, String> entry : tm.entrySet()) {

			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		// copy one treemap content into another treemap

		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();

		tm2.put(6, "Six");
		tm2.put(7, "Seven");
		tm2.put(8, "Eight");
		tm2.put(9, "Nine");
		tm2.put(10, "Ten");

		// copy the contents of tm2 to tm
		tm.putAll(tm2);

		System.out.println("Contents of tm2 after copying tm to tm2:" + tm);

		// search a key in a treemap
		if (tm.containsKey(1)) {
			System.out.println(tm + " contains key 1:" + tm.containsKey(1));
		}

		// search a value in a treemap
		if (tm.containsValue("One")) {
			System.out.println(tm + " contains value One:" + tm.containsValue("One"));
		}

		// get all keys in a treemap
		Set<Integer> keys = tm.keySet();
		System.out.println("Keys in a treemap:");
		for (Integer i : keys) {

			System.out.print(i + " ");

		}

		// get all keys in a treemap
		tm.keySet().stream().forEach(e -> System.out.println(e.toString()));

		// get all the elements in a treemap
		tm.entrySet().stream().forEach(e -> System.out.println(e.getValue()));

		// detele all the entries from treemap
		tm.entrySet().clear();
		System.out.print("Contents  of treemap after clear():" + tm);

		// sort contents of a treemap
		tm.entrySet().stream().sorted();

		TreeMap<Integer, String> tm3 = new TreeMap<Integer, String>(new DescendingSort());

		tm.put(1, "One");
		tm.put(2, "Two");
		tm.put(3, "Three");
		tm.put(4, "Four");
		tm.put(5, "Five");

		tm3.putAll(tm2);
		tm3.putAll(tm);

		tm3.put(20, "Twenty");
		tm3.put(19, "Nineteen");
		tm3.put(17, "Seventeen");
		tm3.put(18, "Eighteen");

		System.out.print("\nContents of treemap3:");
		tm3.entrySet().stream().forEach(e -> System.out.print(e.getKey() + ":" + e.getValue() + "  "));

		// get the least(first) key-value pair
		System.out.print("\nFirst entry:" + tm3.firstKey() + ":" + tm3.firstEntry().getValue());

		// get the (greatest)last key-value pair
		System.out.println("\n Last entry:" + tm3.lastKey() + ":" + tm3.lastEntry().getValue());

		// get the reverse order view of keys in a map.
		System.out.println("\n Original map:" + tm3);
		System.out.println("\n Descending keys view:" + tm3.descendingKeySet());

		// get the reverse order view of map key value pair.
		System.out.println("\n Original map:" + tm3);
		System.out.println("\n Descending map view:" + tm3.descendingMap());

		// get the key-value of the mapping with greatest key less than or equal to the
		// given key
		Entry<Integer, String> e1 = tm3.floorEntry(5);
		System.out.println(e1.toString());

		// Returns a view of the portion of the map whose keys are strictly less than 5.
		System.out.println(tm3.headMap(5).toString());

		// Returns a view of the portion of the map whose keys are strictly less than 5,
		// including 5.
		System.out.println(tm3.headMap(5, true).toString());

		// Returns a key-value mapping associated with the least key strictly greater
		// than the given key, or null if thereis no such key.
		System.out.println(tm3.higherEntry(5).toString());

		// Returns a key-value mapping associated with the greatest key strictly less
		// than the given key, or null if there is no such key.
		System.out.println(tm3.lowerEntry(5));// 4
		System.out.println(tm3.floorEntry(5));// 5

		System.out.println(tm3.lowerKey(5));// 4=Four
		System.out.println(tm3.floorKey(5));// 5=Five

		// Returns a NavigableSet view of the keys contained in this map.
		System.out.println(tm3.navigableKeySet());

		System.out.println("\n Original entries in map:" + tm3);

		// Removes and returns a key-value mapping associated with the least key in this
		// map, or null if the map is empty.
		Entry<Integer, String> pfEntry = tm3.pollFirstEntry();
		System.out.println("\n Polled first entry:" + pfEntry);

		System.out.println("\n Entries after polling:" + tm3);

		System.out.println("\n Original entries in map:" + tm3);
		// Removes and returns a key-value mapping associated with the greatest key in
		// this map, or null if the map is empty.
		Entry<Integer, String> plEntry = tm3.pollLastEntry();
		System.out.println("\n Polled last entry:" + plEntry);

		System.out.println("\n Entries after polling:" + tm3);
		
		//21
	}
}

//comparator to sort the treemap
class DescendingSort implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o1.compareTo(o2);
	}

}
