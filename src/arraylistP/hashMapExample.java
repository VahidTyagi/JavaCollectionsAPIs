package arraylistP;

import java.util.HashMap;

public class hashMapExample {

    public static void main(String[] args) {

        // Creating HashMap
        HashMap<String, String> countryCodes = new HashMap<>();

        // Adding values in HashMap
        countryCodes.put("IN", "India");          // "IN" = key, "India" = value
        countryCodes.put("US", "United States");
        countryCodes.put("UK", "United Kingdom");
        countryCodes.put("JP", "Japan");

        // Overwriting value because key must be unique
        countryCodes.put("UK", "United Kingdom (Updated)");

        // Printing full HashMap (Order NOT guaranteed)
        System.out.println("Country Codes: " + countryCodes);

        // Get value using key
        System.out.println("Value of IN: " + countryCodes.get("IN"));

        // Check if key exists
        System.out.println("Contains key US? " + countryCodes.containsKey("US"));

        // Remove key
        countryCodes.remove("JP");

        // Iterating through HashMap
        System.out.println("\nIterating HashMap:");
        for (String key : countryCodes.keySet()) {
            System.out.println(key + " → " + countryCodes.get(key));
        }
    }
}


/*
🚀 What is HashMap? (Simple Definition)

HashMap is a data structure in Java that stores data in key–value pairs.

✔ Key features

Fast lookup (O(1) average)

Stores data as key → value

Keys must be unique

Values can be duplicate

Allows null key and null values

Order not guaranteed

🌍 Real-World Example of HashMap

Think of HashMap like a dictionary or a country's Aadhaar database.

Example: Aadhaar System

Aadhaar Number (key) → always unique

Citizen Details (value) → name, age, address

Aadhaar example:

Key: 1234 5678 9012  
Value: "Rahul Sharma"

Another simple example:

If you go to a parking lot:

Parking Ticket Number → key

Car details → value

📌 Why do we use HashMap?

Because it gives very fast search, like:

“Give me the user whose Aadhaar is 1234…”

Instead of searching all users one by one,
HashMap directly jumps to the memory location → O(1) time.

🔥 Java HashMap Example (Best & Simple)
✔ Real-world example: Country Codes

IN → India

US → United States

UK → United Kingdom

*/