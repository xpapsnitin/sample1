package com.corejava.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//https://www.w3resource.com/java-exercises/collection/index.php#hashmap
public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");

		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}

		// get the size of the map entries
		System.out.println("Map size:" + hm.size());

		// copy one map to another
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.put(6, "six");
		hm2.put(7, "seven");
		hm2.put(8, "eight");
		hm2.put(9, "nine");
		hm2.put(10, "ten");

		hm.putAll(hm2);

		for (Entry<Integer, String> entry : hm.entrySet()) {

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		// remove an entry from the map
		hm.remove(10);

		hm.entrySet().stream().forEach(e -> System.out.print(e.getKey() + ":" + e.getValue() + " "));
		System.out.println();

		// replace an entry from the map
		hm.replace(1, "ONE");

		hm.entrySet().stream().forEach(e -> System.out.print(e.getKey() + ":" + e.getValue() + " "));

		// remove all entries(mappings) from the map

		hm.clear();

		System.out.println("\nEmpty map ? :" + hm.isEmpty());

		// get a shallow copy of hashmap

		HashMap<Integer, String> clonedHm = (HashMap<Integer, String>) hm2.clone();

		System.out.println("Cloned hashmap:");
		clonedHm.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

		// check if map contains mapping for specific key.
		System.out.println("hm2.containsKey(7):" + hm2.containsKey(7));

		// check if map contains mapping object
		System.out.println("hm2.containsValue(seven):" + hm2.containsValue("seven"));

		//get the set view of the hashMap
		Set<Entry<Integer, String>> entrySet = hm2.entrySet();

		entrySet.stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

		String value = hm2.get(9);
		System.out.println("Value at key 9 in hm2 is: " + value);

		// get the set of keys from the map
		Set<Integer> keySetHm2 = hm2.keySet();

		System.out.println("Key set entries of hm2:");
		keySetHm2.stream().forEach(e -> System.out.print(e.toString()));

		// get the values from the map
		System.out.println("\n values in a map:"+hm2.values()); 
		
	

	}

}
