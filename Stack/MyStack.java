package Stack;



public class MyStack <T> {

	Node<T> First;

	Node<T> Last;

	int i = 0;

	int size;

	MyStack(T ob){
		Node<T> l = Last;
		Node<T> newNode = new Node<>(l,ob,null);
		newNode.index = i;
		Last = newNode;
		i  = Last.index + 1;
		if (l != null)
			l.next = newNode;

		if(newNode.prev == null) First = newNode;


		size++;
	}

	MyStack(){
	}



	public void add(T ob){
		Node<T> l = Last;
		Node<T> newNode = new Node<>(l,ob,null);
		newNode.index = i;
		Last = newNode;
		i  = Last.index + 1;
		if (l != null)
			l.next = newNode;

		if(newNode.prev == null) First = newNode;


		size++;
	}
	public T  peek(){
		return Last.item;
	}
	
	public T  poll(){
		Node<T> l = Last;
		
		Last = Last.prev;
		Last.next = null;
		size--;
		
		return l.item;
	}
	

	public void clear(){
		for(int x = 0;x <=size-1;x++){
			Node<T> l = Last;
			i = 0;
			Last = null;
			Last = l.prev;
		}
		size = 0;

	}

	public void TestIndex(){
		Node<T> f = First;
		for(int x = 0;x <=size-1;x++){
			System.out.println("Индекс : " + First.index);
			First = First.next;
		}
		First = f;
	}

	public void remove(int id){
		id = (size-1) - id; //Круто
		if (id<0 || id > size){
			System.out.println("Неверный индекс");
			return;
		}
		Node<T> f = First;
		Node<T> second = First.next;
		for(int x = 0;x <=size-1;x++){
			if(First.index == id){

				if(First.prev == null) f = second;
				
				if(Last.index == id) {
					Last = Last.prev;
					Last.next = null;
					break;
				}

				if(First.prev != null)
					First.prev.next = First.next;
				First.next.prev = First.prev;

				while(First.next != null){
					First.next.index = First.next.index - 1;	
					First = First.next;
				}
				
				

				First = null;
				i = Last.index+1;
				break;
			}
			First = First.next;
		}
		First = f;
		size--;
	}


	public void show(){
		Node<T> l = Last;
		for(int x = 0;x <=size-1;x++){
			System.out.println(Last.item.toString());
			Last = Last.prev;
		}
		Last = l;
	}

	public int getSize(){
		return size;
	}

	public void reverse(){
		 Last = Last.prev;
		for(int i = 0;i<=size-1;i++){
			
			Last.prev = Last.next;
			Last.next = Last.prev;
			Last = Last.prev;
			
		}

	}

	private class Node<T>{
		T item;
		Node<T> next;
		Node<T> prev;

		int index;

		Node(Node<T> prev, T element, Node<T> next) {
			this.item = element;
			this.next = next;
			this.prev = prev;

		}

	}


}
