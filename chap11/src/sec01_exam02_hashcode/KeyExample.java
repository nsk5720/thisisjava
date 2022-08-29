package sec01_exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();						/*hashmapÀº ²©»õ·Î Ç¥½Ã*/
		hashMap.put(new Key(1), "È«±æµ¿");
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}

}