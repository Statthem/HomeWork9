package Stack;

public class Main {

	public static void main(String[] args)  {

		MyStack<Object> s = new MyStack<>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
	
		
		s.remove(2);
		
		s.add(11);
		
		s.remove(0);
		
		s.show();
		System.out.println();
}
}
