package HashMap;

public class Main {

	public static void main(String[] args) {

		MyHashMap<Integer,String> h = new MyHashMap<>();
		
		h.put(1, "apple");
		h.put(2, "orange");
		h.put(3, "avokado");
		h.put(4, "lol");
		h.put(4, "lol");
		h.put(5, "apple");
		h.put(6, "orange");
		h.put(7, "avokado");
		h.put(8, "lol");
		
		
		
		
		
		System.out.println("Длина равна : " + h.getSize());
		
		
		
		System.out.println("Длина равна : " + h.getSize());
		
		h.remove(6);
		System.out.println(h.getNode(5).next.value.toString());
		
		
	//	System.out.println("гет выводит " +h.get(6).toString());
		
	}

}
