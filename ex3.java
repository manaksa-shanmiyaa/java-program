package task;
import java.util.*;
public class ex3 {
public static void main(String[] args) {
	
	/*ArrayList arrlist = new ArrayList<>();
	arrlist.add(100);
	arrlist.add(200);
	arrlist.add("manaksa");
	System.out.println(arrlist);*/
	
	// for loop
	/*ArrayList<Integer> arrlist = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			arrlist.add(i);
			System.out.println(arrlist);
		}*/
	
	//for each loop
	/*ArrayList<Integer> arrlist = new ArrayList<>();
	arrlist.add(100);
	arrlist.add(200);
	arrlist.add(300);
	arrlist.add(300);
 for(int i:arrlist) {
	 System.out.println(i);
 }*/
	
	//set and get
	/*ArrayList<Integer> arrlist = new ArrayList<>();
	arrlist.add(100);
	arrlist.add(200);
	arrlist.add(300);
	arrlist.add(300);
	System.out.println(arrlist.get(0));
	System.out.println(arrlist.set(0,1000));
	System.out.println(arrlist.remove(0));//remove
	System.out.println(arrlist.get(0));
	System.out.println("..............");
	for(int i:arrlist) {
		System.out.println(i);
	}*/
	
	//LINKED LIST
	/*LinkedList<Integer> l1 = new LinkedList<>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(300);
	System.out.println(l1);
	System.out.println(l1.size());	*/
	
	
	
	//QUEUE
	
	/*Queue<Integer>q1= new LinkedList<>();
	q1.add(100);
	q1.add(200);
	System.out.println(q1);
	System.out.println(q1.peek());
	System.out.println(q1.remove());*/
	
	//SET
	//hash set
	/*HashSet<Integer>  h1= new HashSet<>();
	h1.add(100);
	h1.add(200);

	System.out.println(h1);*/
	
	//TREE SET
	/*TreeSet<Integer>  s1= new TreeSet<>();
	s1.add(100);
	s1.add(200);

	System.out.println(s1);*/
	
	//HASHMAP
	/*HashMap<String,Integer> map = new HashMap<>();
	map.put("Apple",3);
	map.put("Banana",2);
	map.put("Orange",5);
	System.out.println("HashMap"+map);
	System.out.println("apple count:"+map.get("apple"));*/
	
	
 //CONTAINS
	
	HashMap<String,Integer> map = new HashMap<>();
	map.put("Apple",3);
	map.put("Banana",2);
	map.put("Orange",5);
	System.out.println("HashMap"+map);
	//System.out.println("apple count:"+map.get("apple"));
	/*if(map.containsKey("Banana")) {
		System.out.println("Banana is in the map");
		
		if(map.containsValue(3)) {
			System.out.println(value+"is in the map");*/
	
			
			//remove
			/*map.remove("orange");
			System.out.println("After removing Orange:"+map);
			
			//size of map
			
			System.out.println("Size of HasMap:"+map.size());	}*/

	
	//ENTRY SET
	/*System.out.println("iterating using entrysets:");
	for(Map.Entry<String,Integer> entry :map.entrySet()) {
		
		System.out.println(entry.getKey() +":" +entry.getValue());
	
	}
	
	System.out.println("iterating using Keysets:");
	for(String Key : map.keySet()) {
		
		System.out.println(Key +":" +map.get(Key));
}*/
	
	//hash next and next
	ArrayList<String> fruits= new ArrayList<>();
	fruits.add("Apple");
	fruits.add("Orange");
	fruits.add("Cherry");
	Iterator<String> iterator =fruits.iterator();
	System.out.println("fruits using iterators:");
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	


}
}






