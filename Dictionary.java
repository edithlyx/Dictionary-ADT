//Name: Yixin Liang. CruzID: yliang43
public class Dictionary implements DictionaryInterface{
	private Node head;
	private int size;
	 public Dictionary(){
	      head = null;
	      size = 0;
	   }
	 private class Node {
	      String key;
	      String value;
	      Node next;

	      Node(String x, String y){
	         key = x;
	         value = y;
	         next = null;
	      }
	   }
	private Node findKey(String key) {
		Node N = head;
		if(N != null && N.key == key) {
			return N;
		}
		else if(N == null){
			return null;
		}
		else{
		for(int i = 1;i <= size;i++) {
			if(N.key == key) {
				return N;
			}	
	         N = N.next;
	      }
		return null;
		}
	  	}
	//check if the dictionary is empty
	public boolean isEmpty() {
		return (size == 0);
	}
	//check the size of the dictionary
	public int size() {
		return size;
	}

	public String lookup(String key) {
		if(findKey(key) != null) {
			return findKey(key).value;
		}
		return null;
	}

	public void insert(String key, String value) throws DuplicateKeyException {
		if(lookup(key) == null) {
			Node N = head;
			Node insert = new Node(key,value);
			if(N == null) {
				N = insert;
				head = N;
			}
			else {
			while(N.next != null) {
				N = N.next;
			}
			N.next = insert;
			}
		}
		else {
			throw new DuplicateKeyException("cannot insert duplicate keys");
		}
		size++;
	}

	public void delete(String key) throws KeyNotFoundException {
		if(lookup(key) != null) {
			Node N = head;
			if(N.key == key) {
				Node C = N.next;
				head = C;
				N = null;
			}
			else {
			while(N.next != null) {
				if((N.next).key == key) {
					Node P = N;
					P.next = N.next.next;
					N = null;
					break;
				}
				N = N.next;
			}
			}
			size--;
		}
		else {
			throw new KeyNotFoundException("cannot delete non-existent key");
		}
	}
	public void makeEmpty() {
		head = null;
		size = 0;	
	}
	public String toString() {
		StringBuffer sc = new StringBuffer();
		Node N = head;
	      for( ; N!=null; N=N.next){
	         sc.append(N.key).append(" ").append(N.value + "\n");
	      }
	      return new String(sc);	
	}
}


