package coreJava.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<String> createArrayList = createArrayList();
		streamOperations(createArrayList);
	}
  

	private static List<String> createArrayList() {
		List<String> stringList = new ArrayList<String>();
		
		// Add single element to arraylist
		stringList.add("Java");
		stringList.add("Javascript");
		stringList.add("Angular");
		stringList.add("React");
		stringList.add("python");		
		return stringList;
	}

	private static void streamOperations(List<String> createArrayList) {
		// TODO Auto-generated method stub
		// print the element list
		createArrayList.stream().forEach(string ->System.out.println(string));
		
	}

}
