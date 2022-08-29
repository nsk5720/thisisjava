package sec12.exam01_wrapper;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		/*int value1 = Integer.parseInt("10a") 는 불가능 10a는 정수형으로 변환이 안되니께*/
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}

}
