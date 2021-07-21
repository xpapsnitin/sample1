package com.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Data implements Comparable<Data>{
	
	int number;
	int index;
	int count;
	
	public Data(int number, int index, int count) {
		super();
		this.number = number;
		this.index = index;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Data [number=" + number + ", index=" + index + ", count=" + count + "]";
	}


	@Override
	public int compareTo(Data data) {
		
		if(this.count!=data.count) {
			
			return data.count -this.count;
		}
		
		return this.index - data.index;
	}
	
	
	
}

public class SortByFrequencyAndIndex {

	public static void main(String[] args) {
		
		Integer [] array = {90,2,3,90,4,82,90,34,2,3,82,90};
		
		Map<Integer,Data> map = new HashMap<Integer, Data>();
		
		for(int i=0;i<array.length;i++) {
			
			map.putIfAbsent(array[i], new Data(array[i], i, 0));
			map.get(array[i]).count++;
			
		}
		
		//map.entrySet().stream().forEach(e->System.out.println(e));
		
		 List<Data> list =map.values().stream().sorted().collect(Collectors.toList());
		 
		 list.stream().forEach(e->System.out.println(e));
		 
		 int x=0;
		 for (Data data : list) {
			 
			for(int i=0;i<data.count;i++) {
				
				array[x] = data.number;
				x++;
			}
		}
		 
		 System.out.print(Arrays.toString(array));
		 
		}

}
