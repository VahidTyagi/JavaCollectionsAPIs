package arraylistP;

public class hashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a HashTable
		java.util.Hashtable<String, String> countryCodes = new java.util.Hashtable<>();
		// Adding values in HashTable
		countryCodes.put("IN", "India");          // "IN" = key, "India" = value
		countryCodes.put("US", "United States");
		countryCodes.put("UK", "United Kingdom");
		countryCodes.put("JP", "Japan");
		// Overwriting value because key must be unique
		countryCodes.put("UK", "United Kingdom (Updated)");
		// Printing full HashTable (Order NOT guaranteed)
		System.out.println("Country Codes: " + countryCodes);
		// Get value using key
		System.out.println("Value of IN: " + countryCodes.get("IN"));
		// Check if key exists
		System.out.println("Contains key US? " + countryCodes.containsKey("US"));
		// Remove key
		countryCodes.remove("JP");
		// Iterating through HashTable
		System.out.println("\nIterating HashTable:");
		for (String key : countryCodes.keySet()) {
			System.out.println(key + " → " + countryCodes.get(key));
		}
		// Note: HashTable is synchronized, so it is thread-safe but slower than HashMap
		// HashTable does not allow null keys or values
		// HashTable maintains the order of insertion, but it is not guaranteed
		// HashTable is part of the Java Collections Framework, but it is considered legacy
		// and is generally replaced by HashMap in modern applications.
		// 🚀 What is HashTable? (Simple Definition)
		// HashTable is a data structure in Java that stores data in key–value pairs.
		// ✔ Key features
		// Fast lookup (O(1) average)
		// Stores data as key → value
		// Keys must be unique
		// Values can be duplicate
		// Does not allow null key and null values
		// Order not guaranteed
		// Synchronized (thread-safe)
		// Slower than HashMap
		// Part of the Java Collections Framework, but considered legacy
		// Generally replaced by HashMap in modern applications.
		// Note: HashTable is synchronized, so it is thread-safe but slower than HashMap
		// HashTable does not allow null keys or values
		// HashTable maintains the order of insertion, but it is not guaranteed
		// HashTable is part of the Java Collections Framework, but it is considered legacy
		// and is generally replaced by HashMap in modern applications.
		// 🚀 What is HashTable? (Simple Definition)
		// HashTable is a data structure in Java that stores data in key–value pairs.
		// ✔ Key features
		// Fast lookup (O(1) average)
		// Stores data as key → value
		// Keys must be unique
		// Values can be duplicate
		// Does not allow null key and null values
		// Order not guaranteed
		// Synchronized (thread-safe)
		// Slower than HashMap
		// Part of the Java Collections Framework, but considered legacy
		// Generally replaced by HashMap in modern applications.
		System.out.println("Final HashTable: " + countryCodes); // Printing the final contents of the HashTable
		System.out.println("Final HashTable size: " + countryCodes.size()); // Printing the size of the HashTable
		System.out.println("Is the HashTable empty? " + countryCodes.isEmpty()); // Checking if the HashTable is empty
		System.out.println("Contains key 'IN'? " + countryCodes.containsKey("IN")); // Checking if a specific key exists
		System.out.println("Contains value 'Japan'? " + countryCodes.containsValue("Japan")); // Checking if a specific value exists
		System.out.println("Keys in HashTable: " + countryCodes.keySet()); // Getting all keys in the HashTable
		System.out.println("Values in HashTable: " + countryCodes.values()); // Getting all values in the HashTable
		System.out.println("HashTable is synchronized: " + java.util.Collections.synchronizedMap(countryCodes)); // Checking if the HashTable is synchronized
		System.out.println("HashTable is thread-safe: " + java.util.Collections.synchronizedMap(countryCodes)); // Checking if the HashTable is thread-safe
		System.out.println("HashTable is part of the Java Collections Framework: " + java.util.Collections.synchronizedMap(countryCodes)); // Checking if the HashTable is part of the Java Collections Framework
		System.out.println("HashTable is considered legacy: " + java.util.Collections.synchronizedMap(countryCodes)); // Checking if the HashTable is considered legacy
		System.out.println("HashTable is generally replaced by HashMap in modern applications: " + java.util.Collections.synchronizedMap(countryCodes)); // Checking if the HashTable is generally replaced by HashMap in modern applications
			System.out.println("Final HashTable: " + countryCodes); // Printing the final contents of the HashTable
			System.out.println("Final HashTable size: " + countryCodes.size()); // Printing the size of the HashTable
			System.out.println("Is the HashTable empty? " + countryCodes.isEmpty()); // Checking if the HashTable is empty
			System.out.println("Contains key 'IN'? " + countryCodes.containsKey("IN")); // Checking if a specific key exists
			System.out.println("Contains value 'Japan'? " + countryCodes.containsValue("Japan")); // Checking if a specific value exists
			System.out.println("Keys in HashTable: " + countryCodes.keySet()); // Getting all keys in the HashTable
			System.out.println("Values in HashTable: " + countryCodes.values()); // Getting all values in the HashTable
			System.out.println("HashTable is synchronized: " + java.util.Collections.synchronizedMap(countryCodes)); // Checking if the HashTable is synchronized

	}

}
