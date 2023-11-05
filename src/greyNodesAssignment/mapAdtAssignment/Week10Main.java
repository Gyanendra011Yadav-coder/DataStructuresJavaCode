package greyNodesAssignment.mapAdtAssignment;

import java.util.ArrayList;
import java.util.List;

public class Week10Main {

	private static List<MyEntry> myMap = new ArrayList<MyEntry>();
	
	
	public static void main(String[] args) {
		myMap.add(new MyEntry(1,"Hi"));
		myMap.add(new MyEntry(23,"Hello"));
		myMap.add(new MyEntry(17,"Hey"));
		myMap.add(new MyEntry(2,"Greetings"));
		myMap.add(new MyEntry(20,"Yo"));
		addToMap("Good Day");
		outputMyMap();
		sortMyMapKeysAsc();
		outputMyMap();
		outputMyFancyMap();
	}
	
	//Output comma key-value pairs on each line, for each Entry in myMap
	//Note the special way the for loop works. 
	private static void outputMyMap() {
		for(Object oEntry: myMap.toArray()) {
			MyEntry entry = (MyEntry)oEntry;
			System.out.println(((Integer)entry.key).toString() + '-' + entry.value);
		}
	}
	
	//Sorts the myMap object array in ascending order by keys
	private static void sortMyMapKeysAsc() {
        int n = myMap.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (myMap.get(j).key > myMap.get(j+1).key)
                {
                	MyEntry temp = myMap.get(j);
                    myMap.set(j, myMap.get(j+1));
                    myMap.set(j+1,temp);
                }
		return;
	}
	//Sorts the myMap object array in descending order by keys
	private static void sortMyMapKeysDesc() {
		return; //TODO: implement
		
	}
	//Sorts the myMap object array in ascending order by values
	private static void sortMyMapValuesAsc() {
		return; //TODO: Implement
	}
	//Sorts the myMap object array in ascending order by keys
	private static void sortMyMapValuesDesc() {
		return; //TODO: implement
		
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
            //TODO: Implement
	}
	
	
	//Finds the next highest integer key in myMap and puts the value in that key
	//E.g. if the value is "Good Day" and myMap's highest key is 23, this function
	//will put "Good Day" in myMap with a key of 24.
	//Assume key values are positive integers starting with 1.
	private static void addToMap(String value) {
		//TODO: Implement
		
	}
	

}
