package com.corejava.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList1 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		// insert element at first position
		list.add(0, "First");
		System.out.println(list);
		// Retrieve from specific index
		System.out.println(list.get(4));

		// update the element at specific index
		list.set(0, "Firsstt");
		list.set(5, "Lastttt");
		System.out.println(list);
		// remove 3rd element from arraylist.
		list.remove(2);

		System.out.println(list);

		System.out.println("\nDisplay list using foreach loop");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println("\nDisplay list using iterator");
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

		// searching an element in an array
		String searchElement = "Orange";

		boolean searchFlag = false;
		int index = 0;
		for (String element : list) {
			if (element.equals(searchElement)) {
				searchFlag = true;
				break;
			}
			index++;
		}
		System.out.println("\n" + searchElement + " found at index: " + index);

		if (list.contains(searchElement)) {
			System.out.println(searchElement + " found");
		}

		// sorting an arraylist in ascending(natural sorting order)
		// list.sort(null);
		Collections.sort(list);
		System.out.println("\n List elements after sorting:" + list);

		List<String> sortedList = list.stream().sorted((ob1, ob2) -> {
			return ob2.compareToIgnoreCase(ob1);
		}).collect(Collectors.toList());

		System.out.println("\n Descending order sort:" + sortedList);

		// copy one arraylist to another
		List<String> list2 = new ArrayList<String>();
		list2.add("One");
		list2.add("One");
		list2.add("One");
		list2.add("One");
		list2.add("One");
		list2.add("One");
		// list2.addAll(sortedList);
		System.out.println(list2.size());
		Collections.copy(list2, sortedList);

		System.out.println("\n Elements of list2 copied from sortedlist:" + list2);

		// shuffle elements in arraylist
		Collections.shuffle(list2);

		System.out.println("\n Elements of list2 after shuffle:" + list2);

		Collections.reverse(list2);

		System.out.println("\n Elements of list2 after reverse:" + list2);

		List<String> subList = list2.subList(0, 3);
		System.out.println("\n Sublist of list2 with first 3 elements:" + subList);

		boolean isEqual = true;

		if (list.size() == list2.size()) {
			// comparing two arraylists.
			for (String s : list) {

				if (!list2.contains(s)) {
					isEqual = false;
					break;
				}
			}
		} else {
			isEqual = false;
		}

		if (isEqual)
			System.out.println(list + " and " + list2 + "are equal");
		else
			System.out.println(list + " and " + list2 + "are not equal");

		System.out.println("Original list:" + list2);
		// swapping elements in an arraylist.
		Collections.swap(list2, 0, 3);
		System.out.println("After swaping 1st element with 4th element:" + list2);
		
		
		//Joining the two lists.
		List<String> newList = new ArrayList<String>();
		newList.addAll(list2);
		newList.addAll(list);
		
		System.out.println("After joining the two lists:" + newList);
		
		//cloning
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> clonedAList = (ArrayList<Integer>) myList.clone();
		
		System.out.println("Cloned list:" + clonedAList);
		
		clonedAList.set(0, 11);
		
		System.out.println("Cloned list:" + clonedAList);
		System.out.println("Original list:" + myList);
		
		myList.set(1, 22);
		
		System.out.println("Cloned list:" + clonedAList);
		System.out.println("Original list:" + myList);
		
		//remove all the elements of an arrayList
		myList.removeAll(myList);
		
		System.out.println("Cloned list:" + clonedAList);
		System.out.println("Original list:" + myList);
		System.out.println("Cloned list:" + clonedAList);
		System.out.println("Check if list is empty:" + myList.isEmpty());
		
		//trim to size.
		System.out.println("List size:" + clonedAList.size());
		clonedAList.trimToSize();
		System.out.println("List size:" + clonedAList.size());
		
		
		//ensure the capacity of the list
		clonedAList.ensureCapacity(6);
		System.out.println("List:" + clonedAList);
		clonedAList.add(5);
		clonedAList.add(6);
		clonedAList.add(7);
		clonedAList.add(5);
		clonedAList.add(6);
		clonedAList.add(7);
		System.out.println("List:" + clonedAList);
		
	}

}