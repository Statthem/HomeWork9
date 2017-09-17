package HashMap;



public class MyHashMap<T,V>{

	Node<T,V> First;

	T LastKey ;

	Node<T,V> Tmp;

	Node<T,V> Last;



	int size;

	boolean j = false;

	MyHashMap(T key,V value){
		Node<T,V> newNode = new Node<>(key,value,null);//2.next = null
		if (j  == false){
			First = newNode;
		}
		else{
			getNode(LastKey).next = newNode;//1.next
		}
		LastKey = newNode.key;

		j = true;
		size++;
	}

	MyHashMap(){
	}

	public void put(T key,V value){
		if(contains(key)){
			Node<T,V> newNode = new Node<>(key,value,null);//2.next = null
			if (j  == false){	
				System.out.println("j = false");
				First = newNode;
			}
			else{
				System.out.println("j = true");
				getNode(LastKey).next = newNode;//1.next
			}
			LastKey = newNode.key;
			j = true;
			size++;

		}
		else System.out.println("не удалось добавить ключ!!! ");
	}

	public Node<T,V> getNode(T key){
		if(First.next == null) return First;
		Node<T,V> f = First;
		for(int i = 0;i<size-1;i++){
			f = f.next;
			if(f.key == key){
				return f;
			}
		}

		return null;
	}



	public V  get(T key){
		Node<T,V> f = First;
		while(f.next != null){
			if(f.key == key) return f.value;
			f = f.next;
		}
		return null;

	}



	public void clear(){
		if(First.next == null){  First = null; size = 0;
		return;
		}
		for(int i = 0;i<size-1;i++){
			Node<T,V> f = First;
			First = null; 
			First = f.next;

		}
		size = 0;

		while(First.next != null){
			size++;
		}



	}



	public void remove(T key){
		Node<T,V> f = First;
		while(First.next != null){
			
			if(First.next.key == key) {
				First.next = First.next.next;
				
			}
			First = First.next;
		}
		First = f;

	}



	public int getSize(){
		return size;
	}


	public boolean contains(T key) 
	{
		Node<T,V> f = First;
		for(int i = 0;i<=size-1;i++){
			if(First.key == key){
				System.out.println("this key already exists");
				First = f;
				return false;
			}
			First = First.next;
		}
		First = f;
		return true;

	}


	public class Node<T,V>{
		T key;
		V value;
		Node<T,V> next;


		Node(T key,V value, Node<T,V> next) {
			this.key = key;
			this.value = value;
			this.next = next;


		}

	}


}
