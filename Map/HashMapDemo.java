public class HashMapDemo {

	public static void main(String[] args) {
		// hashmap with default capacity 16 and default load factor 0.75
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// put method used to add a key-value pair to the map
		map1.put(1, "hetal");
		map1.put(2, "rachh");
		map1.put(3, "hetal rachh");
		map1.put(null, "key is null");
		map1.put(4, null);
		map1.put(5, null);

		System.out.println("**** Map1 contents are ****");

		// print the map
		map1.entrySet()
				.forEach(entry -> System.out.println("Key = " + 
                entry.getKey() + " Value = " + entry.getValue()));

		// get the number of elements present in the map
		System.out.println("Size of map1 = " + map1.size());

		// get the value based on the key
		System.out.println("Value with key 3 = " + map1.get(3));

		// hashmap with initial capacity 20 and default load factor 0.75
		Map<Integer, String> map2 = new HashMap<Integer, String>(20);
		map2.put(11, "hetal");
		map2.put(22, "rachh");
		map2.put(33, "hetal rachh");

		System.out.println();

		System.out.println("**** Map2 contents are ****");

		// iterate over the map using entrySet()
		for (Map.Entry<Integer, String> e : map2.entrySet()) {
			System.out.println("Key = " + e.getKey() + " Value = " + 
                e.getValue());
		}

		System.out.println();

		// remove entry with key=11
		map2.remove(11);

		System.out.println("**** Map2 contents are after removing entry with 
                key=11 ****");
		for (Map.Entry<Integer, String> e : map2.entrySet()) {
			System.out.println("Key = " + e.getKey() + " Value = " + 
                e.getValue());
		}

		// containsKey is used to check if the map2 contains an entry with
		// key=33
		if (map2.containsKey(33)) {
			System.out.println("Value with key=33 is " + map2.get(33));
		}

		// getOrDefault method returns the default value specified if the key
		// passed is not found in map
		System.out.println("Value returned for key=11 is " + map2.getOrDefault(11, 
                "Default value"));

		System.out.println();

		// hashmap with default capacity 5 and load factor 0.5
		Map<Integer, String> map3 = new HashMap<Integer, String>(5, 0.5f);

		map3.put(1, "hetal");
		map3.put(2, "rachh");

		// capacity is doubled when 3rd element is put in the map (i.e. when the
		// size reaches to 50% of capacity)
		map3.put(3, "hetal rachh");

		System.out.println("**** Map3 contents are ****");

		map3.entrySet()
				.forEach(entry -> System.out.println("Key = " + 
                entry.getKey() + " Value = " + entry.getValue()));

		// isEmpty is used to check if the map is empty or not
		System.out.println("Is map3 empty = " + map3.isEmpty());

		// clear map map3
		map3.clear();

		System.out.println("Is map3 empty after calling clear() = " + 
                map3.isEmpty());

		System.out.println();

		Map<String, String> temp = new HashMap<String, String>();
		temp.put("key1", "value1");
		temp.put("key2", "value2");
		temp.put("key3", "value3");
		temp.put("key4", "value3");

		// hashmap with default capacity and load factor as of temp map
		Map<String, String> map4 = new HashMap<String, String>(temp);

		System.out.println("**** Map4 contents are ****");
		map4.keySet().forEach(key -> System.out.println("Key = " + key + " Value = 
                " + map4.get(key)));

		// containsValue is used to check if one or more key is mapped to this
		// value
		System.out.println("map4 containsValue value3 = " + temp.containsValue("value3"));

	}

}