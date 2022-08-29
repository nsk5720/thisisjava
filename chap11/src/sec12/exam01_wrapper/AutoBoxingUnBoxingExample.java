package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {		//이상한게 아님
		//자동Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//대입시 자동 UnBoxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산시 자동 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
