package arraylistP;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet example
		java.util.HashSet<String> set = new java.util.HashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");
		set.add("Orange");
		set.add("Grapes");
		set.add("Apple"); // Duplicate, will not be added- output will not change
		set.remove("Banana"); // Removing "Banana"
		set.clear(); // Clearing the set
		System.out.println("Set size: " + set.size()); // Printing the size of the set
		System.out.println("Set contents: " + set); // Printing the contents of the set
		System.out.println("Is the set empty? " + set.isEmpty()); // Checking if the set is empty
		System.out.println("Contains 'Mango'? " + set.contains("Mango")); // Checking if "Mango" is in the set
		System.out.println("Final Set: " + set); // Printing the final contents of the set
		// HashSet methods
		
		set.add("Pineapple"); // Adding "Pineapple"
		set.add("Kiwi"); // Adding "Kiwi"
		set.remove("Apple"); // Removing "Apple"
		set.add("Strawberry"); // Adding "Strawberry"
		set.add("Blueberry"); // Adding "Blueberry"
		System.out.println("HashSet after additional operations: " + set); // Printing the final contents of the hash set
		System.out.println("Size of the HashSet: " + set.size()); // Printing the size of the hash set
		System.out.println("Is the HashSet empty? " + set.isEmpty()); // Checking if the hash set is empty
		System.out.println("Contains 'Grapes'? " + set.contains("Grapes")); // Checking if "Grapes" is in the hash set
		System.out.println("Contains 'Orange'? " + set.contains("Orange")); // Checking if "Orange" is in the hash set
		System.out.println("Final HashSet: " + set); // Printing the final contents of the hash set
		// HashSet does not maintain order, so the order of elements may vary
		System.out.println("HashSet does not maintain order, so the order of elements may vary.");
		System.out.println("Final HashSet: " + set); // Printing the final contents of the hash set
		System.out.println("Size of the HashSet: " + set.size()); // Printing the size of the hash set
		System.out.println("Is the HashSet empty? " + set.isEmpty()); // Checking if the hash set is empty
		System.out.println("Contains 'Mango'? " + set.contains("Mango")); // Checking if "Mango" is in the hash set
		System.out.println("Contains 'Pineapple'? " + set.contains("Pineapple")); // Checking if "Pineapple" is in the hash set
		System.out.println("Contains 'Kiwi'? " + set.contains("Kiwi")); // Checking if "Kiwi" is in the hash set
		System.out.println("Contains 'Strawberry'? " + set.contains("Strawberry")); // Checking if "Strawberry" is in the hash set

	}

}
