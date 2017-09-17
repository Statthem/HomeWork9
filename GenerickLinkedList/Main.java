package GenerickLinkedList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Main {
	
	
	
	Main aq;

	public static void main(String[] args) throws IOException {
		
		
		MyLinkedList MyList = new MyLinkedList(12);
		MyLinkedList<String> MyList1 = new MyLinkedList<>();
		
		for(int i = 0;i<100;i++){
			MyList.add(i);
		}
		
		System.out.println(MyList.getSize());
		System.out.println();
		MyList.show();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	
		
		for(int i = 50;i<70;i++){	
	MyList.remove(i);
		}
		System.out.println("После remove");
	MyList.show();
	System.out.println();
	
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	MyList.show();
	
Integer that =	(Integer) MyList.get(13);
	System.out.println("13 - ый элемент " +that);

		
		
	
	
	
}
}
		
		/*
		
		ListIterator LIterator = list.listIterator();
		LIterator.next();
		LIterator.add("hey");
		
		System.out.println(list.toString());
		
		LIterator.previous();
		LIterator.add("hoy");
	
		
		LIterator.next();
		
		
		if(LIterator.hasNext())LIterator.next();
		LIterator.set("hay");
		System.out.println(LIterator.nextIndex());
		System.out.println(list.remove(LIterator.previousIndex()));
		LIterator.next();
		LIterator.set("huy");
		
		
		System.out.println(list.toString());
		
		while (LIterator.hasPrevious())
		    System.out.println(LIterator.previous());
		
		LIterator.remove();
		LIterator.add("Howa");
		
		 
		
		System.out.println(list.toString());
		
		Iterator x = ((LinkedList) list).descendingIterator();

		   // print list with descending order
		   while (x.hasNext()) {
		   System.out.println(x.next());
	   
		    FileWriter fw = new FileWriter("C:/Users/Alex/Desktop/GameRanger_Launch_Log.txt");
		fw.write("Foooo 351");
		fw.write("Obviously you GAI", 13, 4);
		fw.close();
		
		
		
			BufferedReader  br  = new 	BufferedReader
					(new FileReader("C:/Users/Alex/Desktop/GameRanger_Launch_Log.txt"));
		String s =	br.readLine();
		int i = Integer.parseInt(s.substring(6, 9));
		
		
		System.out.println(s + "\ni = " + i);
		br.close();
		
		
	}
	}

}
*/
