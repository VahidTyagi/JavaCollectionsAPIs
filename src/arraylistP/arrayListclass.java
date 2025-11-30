package arraylistP;

import java.util.ArrayList;

public class arrayListclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");	
		list.add("Banana");
		list.add(0, "Mango"); // Adding at index 0
		list.add("Orange");
		
		list.set(1, "Grapes"); // Replacing "Banana" with "Grapes"
		list.remove("Apple"); // Removing "Apple"
		list.lastIndexOf(list.get(2)); // Getting the index of "Orange"
		list.clear(); // Clearing the list
		
		System.out.println("List size: " + list.size()); // Printing the size of the list
		System.out.println("List contents: " + list); // Printing the contents of the list
		System.out.println("Is the list empty? " + list.isEmpty()); // Checking if the list is empty
		
		System.out.println(list.indexOf("Grapes")); // Getting the index of "Grapes"
		list.contains("Mango"); // Checking if "Mango" is in the list
		
		System.out.println("Final List: " + list); // Printing the final contents of the list
		
	}

}
