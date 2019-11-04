
public class DictionaryTest {
public static void main(String[] args) {
	Dictionary A = new Dictionary();
	//insert pairs of keys and values into dictionary
	A.insert("ab", "charater");
	A.insert("98", "number");
	
	//check if lookup can find the matched value
	String v = A.lookup("ab");
	System.out.println(v);
	
	//check if lookup returns correctly to the insert method
	v = A.lookup("78");
	System.out.println(v);
	A.insert("78", "another number");
	
	//check if isEmpty works
	System.out.println(A.isEmpty());
	
	//check if dictionary has correct size
	System.out.println(A.size());
	
	System.out.println(A);
	
	//check if delete works correct for certain keys
	A.delete("98");
	A.size();
	System.out.println(A);
	
	//check if the method throw the correct error with correct message
	//A.delete("324");
	
	//check if makeEmpty can clear the dictionary
	A.makeEmpty();
	
	A.insert("zghchjk", "charater");
	A.insert("2345767", "numbers");
	System.out.println(A);
}
}
