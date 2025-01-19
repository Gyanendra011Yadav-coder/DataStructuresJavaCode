package FirstPhaseLearning.greyNodesAssignment.mapAdtAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week10Main {

    private static List<MyEntry> myMap = new ArrayList<MyEntry>();


    public static void main(String[] args) {

        myMap.add(new MyEntry(1, "Hi"));
        myMap.add(new MyEntry(23, "Hello"));
        myMap.add(new MyEntry(17, "Hey"));
        myMap.add(new MyEntry(2, "Greetings"));
        myMap.add(new MyEntry(20, "Yo"));
        addToMap("Good Day");

        System.out.println("Output of map using: outputMyMap() Method");
        outputMyMap();
        System.out.println();
        System.out.println();

        System.out.println("FirstPhaseLearning.Sorting map in Ascending order: sortMyMapKeysAsc() method");
        sortMyMapKeysAsc();

        System.out.println("Again,printing map using: outputMyMap() Method");
        outputMyMap();
        System.out.println();
        System.out.println();

        System.out.println("It's time to print fancyMap using: outputMyFancyMap() method");
        outputMyFancyMap();

		//TODO: Below code is to fill table of the assignment
		/*
		 myMap.add(new MyEntry(5,"X"));
		myMap.add(new MyEntry(7,"F"));
		System.out.println("print1:");
		outputMyMap();

		myMap.add(new MyEntry(2,"C"));
		myMap.add(new MyEntry(8,"D"));
		System.out.println("print2:");
		outputMyMap();

		myMap.add(new MyEntry(2,"E"));
		System.out.println("print3:");
		outputMyMap();

		System.out.println("Getting value at key 7: "+getValueByKey(7));

		myMap.add(new MyEntry(7,"Y"));
		System.out.println("print4:");
		outputMyMap();

		System.out.println("Getting value at key 4: "+getValueByKey(4));

		myMap.add(new MyEntry(4,"X"));
		System.out.println("print5:");
		outputMyMap();

		System.out.println("Getting value at key 4: "+getValueByKey(4));

		System.out.println("Size of the map is:"+myMap.size());

		System.out.println("Removing key at index 5"+removeByKey(5));

		System.out.println(myMap.isEmpty());

		System.out.println(myMap.size());
		 */
	}

    //Output comma key-value pairs on each line, for each Entry in myMap
    //Note the special way the for loop works.
    private static void outputMyMap() {
        for (Object oEntry : myMap.toArray()) {
            MyEntry entry = (MyEntry) oEntry;
            System.out.println(((Integer) entry.key).toString() + '-' + entry.value);
        }
    }

    //Sorts the myMap object array in ascending order by keys
    private static void sortMyMapKeysAsc() {
        int n = myMap.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (myMap.get(j).key > myMap.get(j + 1).key) {
                    MyEntry temp = myMap.get(j);
                    myMap.set(j, myMap.get(j + 1));
                    myMap.set(j + 1, temp);
                }
        return;
    }

    //Sorts the myMap object array in descending order by keys
    private static void sortMyMapKeysDesc() {
        for (int i = 0; i < myMap.size() - 1; i++) {
            for (int j = 0; j < myMap.size() - i - 1; j++) {
                if (myMap.get(j).key < myMap.get(j + 1).key) {
                    MyEntry temp = myMap.get(j);
                    myMap.set(j, myMap.get(j + 1));
                    myMap.set(j + 1, temp);
                }
            }
        }
    }

    //Sorts the myMap object array in ascending order by values
    private static void sortMyMapValuesAsc() {
        for (int i = 0; i < myMap.size() - 1; i++) {
            for (int j = 0; j < myMap.size() - i - 1; j++) {
                if (myMap.get(j).value.compareTo(myMap.get(j + 1).value) > 0) {
                    MyEntry temp = myMap.get(j);
                    myMap.set(j, myMap.get(j + 1));
                    myMap.set(j + 1, temp);
                }
            }
        }
    }

    //Sorts the myMap object array in ascending order by keys
    private static void sortMyMapValuesDesc() {
        for (int i = 0; i < myMap.size() - 1; i++) {
            for (int j = 0; j < myMap.size() - i - 1; j++) {
                if (myMap.get(j).value.compareTo(myMap.get(j + 1).value) < 0) {
                    MyEntry temp = myMap.get(j);
                    myMap.set(j, myMap.get(j + 1));
                    myMap.set(j + 1, temp);
                }
            }
        }
    }

    //This function:
    //1st outputs "KEYS:" as a header
    //2nd outputs all the keys separated by commas, in ascending order
    //3rd outputs "VALUES:" as a header
    //4th outputs all the values corresponding to the keys above
    //5th outputs "All Order:"
    //6th calls outputMyMap, with the keys in order

    /*e.g.
    KEYS:1,21,23
    VALUES:Hi,Hello,Hey

    ALL OUTPUT:
    1,Hi
    21,Hey
    23,Hello
    */
    private static void outputMyFancyMap() {
        // Output "KEYS:" as a header
        System.out.print("KEYS:");

        // Sort keys in ascending order
        List<Integer> keys = new ArrayList<>();
        for (MyEntry entry : myMap) {
            keys.add(entry.key);
        }
        Collections.sort(keys);

        // Output keys separated by commas
        for (int key : keys) {
            System.out.print(key + ",");
        }
        System.out.println();  // Move to the next line

        // Output "VALUES:" as a header
        System.out.print("VALUES:");

        // Output values corresponding to the sorted keys
        for (int key : keys) {
            for (MyEntry entry : myMap) {
                if (entry.key == key) {
                    System.out.print(entry.value + ",");
                }
            }
        }
        System.out.println();  // Move to the next line

        // Output "All Order:" as a header
        System.out.println("All Order:");

        // Call outputMyMap with the keys in order
        for (int key : keys) {
            for (MyEntry entry : myMap) {
                if (entry.key == key) {
                    System.out.println(key + "-" + entry.value);
                }
            }
        }
    }


    //Finds the next highest integer key in myMap and puts the value in that key
    //E.g. if the value is "Good Day" and myMap's highest key is 23, this function
    //will put "Good Day" in myMap with a key of 24.
    //Assume key values are positive integers starting with 1.
    private static void addToMap(String value) {
        int highestKey = 0;
        for (MyEntry entry : myMap) {
            if (entry.key > highestKey) {
                highestKey = entry.key;
            }
        }
        myMap.add(new MyEntry(highestKey + 1, value));
    }

	// method to get value of a particular key
	public static String getValueByKey(int key) {
		for (MyEntry entry : myMap) {
			if (entry.key == key) {
				return entry.value;
			}
		}
		return "Key not found";
	}

	// Method to remove particular key from map
	public static String removeByKey(int key) {
		for (MyEntry entry : myMap) {
			if (entry.key == key) {
				myMap.remove(entry);
				return "Key removed successfully";
			}
		}
		return "Key not found";
	}

}
