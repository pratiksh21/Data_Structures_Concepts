HashMap

geeks for geeks:       https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/?ref=lbp

1. Adding Elements in HashMap in Java -------------------------------------------------------------------------------------

// Java program to add elements
// to the HashMap

        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        // Add Elements using put method
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

Output
Mappings of HashMap hm1 are : {1=Geeks, 2=For, 3=Geeks}
Mapping of HashMap hm2 are : {1=Geeks, 2=For, 3=Geeks}

2. Changing Elements in HashMap in Java -----------------------------------------------------------------------------------

         // Java program to change
        // elements of HashMap


        // Initialization of a HashMap
        HashMap<Integer, String> hm
            = new HashMap<Integer, String>();

        // Change Value using put method
        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");

        System.out.println("Initial Map " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map " + hm);
  
Output
Initial Map {1=Geeks, 2=Geeks, 3=Geeks}
Updated Map {1=Geeks, 2=For, 3=Geeks}


3. Removing Element from Java HashMap -------------------------------------------------------------------

       Map<Integer, String> hm= new HashMap<Integer, String>();

        // Add elements using put method
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        hm.put(4, "For");

       

        hm.remove(4);

        // Final HashMap
        System.out.println("Mappings after removal are : "
                           + hm);
    }
}
Output
Mappings of HashMap are : {1=Geeks, 2=For, 3=Geeks, 4=For}
Mappings after removal are : {1=Geeks, 2=For, 3=Geeks}

4. Traversal of Java HashMap --------------------------------------------------------------------

 
      for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
    }
}


Output
Key: vaibhav Value: 20
Key: vishal Value: 10
Key: sachin Value: 30


Time ans space complexity of an hashmap ----------------------------------------------

Methods

Time Complexity

Space Complexity

Adding Elements in HashMap

O(1)

O(N)

Removing Element from HashMap

O(1)

O(N)

Extracting Element from Java

O(1)

O(N)


Internal structure of an hashmap ----------------------------------

Internally HashMap contains an array of Node and a node is represented as a class that contains 4 fields: 

int hash
K key
V value
Node next
It can be seen that the node is containing a reference to its own object. So it’s a linked list. 





# Methods----------------------------------------------------------------

important functions:

containsKey(Object key)	Returns true if this map contains a mapping for the specified key.
containsValue(Object value)	Returns true if this map maps one or more keys to the specified value.
entrySet()	Returns a Set view of the mappings contained in this map.
get(Object key)	Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
isEmpty()	Returns true if this map contains no key-value mappings.
keySet()	Returns a Set view of the keys contained in this map.
put(K key, V value)	Associates the specified value with the specified key in this map.
putAll(Map<? extends K,? extends V> m)	Copies all of the mappings from the specified map to this map.
remove(Object key)	Removes the mapping for the specified key from this map if present.
size()	Returns the number of key-value mappings in this map.
values()	Returns a Collection view of the values contained in this map.


Description

clear()	Removes all of the mappings from this map.
clone()	Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
compute(K key, BiFunction<? super K, ? super V,? extends V> remappingFunction)	Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)	If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null. 
computeIfPresent(K key, BiFunction<? super K, ? super V,? extends V> remappingFunction)	If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value. 
merge(K key, V value, BiFunction<? super V, ? super V,? extends V> remappingFunction)	If the specified key is not already associated with a value or is associated with null, associate it with the given non-null value.
put(K key, V value)	Associates the specified value with the specified key in this map.
putAll(Map<? extends K,? extends V> m)	Copies all of the mappings from the specified map to this map.
remove(Object key)	Removes the mapping for the specified key from this map if present.
size()	Returns the number of key-value mappings in this map.
values()	Returns a Collection view of the values contained in this map.

Methods inherited from class java.util.AbstractMap -------------------------
Method

Description

equals()

Compares the specified object with this map for equality.
hashCode()

Returns the hash code value for this map.
toString()

Returns a string representation of this map.


Methods inherited from interface java.util.Map n-------------------------
Method

Description

equals()	Compares the specified object with this map for equality.
forEach(BiConsumer<? super K, ? super V> action)

Performs the given action for each entry in this map until all entries have been processed or the action throws an exception. 
getOrDefault(Object key, V defaultValue)	Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
hashCode()	Returns the hash code value for this map.
putIfAbsent(K key, V value)	If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
remove(Object key, Object value)	Removes the entry for the specified key only if it is currently mapped to the specified value.
replace(K key, V value)	Replaces the entry for the specified key only if it is currently mapped to some value.
replace(K key, V oldValue, V newValue)	Replaces the entry for the specified key only if currently mapped to the specified value.
replaceAll(BiFunction<? super K,? super V,? extends V> function)

Replaces each entry’s value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

