package arraylistP;

public class linkedlistclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linked list 
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
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
		// LinkedList methods
		
		list.addFirst("Pineapple"); // Adding at the beginning
		list.addLast("Kiwi"); // Adding at the end
		list.removeFirst(); // Removing the first element
		list.removeLast(); // Removing the last element
		list.getFirst(); // Getting the first element
		list.getLast(); // Getting the last element
		list.peek(); // Getting the first element without removing it
		list.poll(); // Getting and removing the first element
		list.offer("Strawberry"); // Adding an element at the end
		list.offerFirst("Blueberry"); // Adding an element at the beginning
		list.offerLast("Raspberry"); // Adding an element at the end
		System.out.println("LinkedList after additional operations: " + list); // Printing the final contents of the linked list
		System.out.println("Size of the LinkedList: " + list.size()); // Printing the size of the linked list
		System.out.println("Is the LinkedList empty? " + list.isEmpty()); // Checking if the linked list is empty
		System.out.println("First element: " + list.getFirst()); // Getting the first element
		System.out.println("Last element: " + list.getLast()); // Getting the last element
		System.out.println("Contains 'Grapes'? " + list.contains("Grapes")); // Checking if "Grapes" is in the linked list

	}

}
