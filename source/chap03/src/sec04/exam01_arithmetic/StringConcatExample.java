package sec04.exam01_arithmetic;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "Ư¡";
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0;               //ó���� ���ڶ� ���ڷ� �νĵ� ���¿��� ���ڷ� ������   
		String str4 = 3 + 3.0 + "JDK";               //ó���� ���ڶ� ���ڰ���ϰ� ���ڰ� �ڿ� ����               ��ġ����
		System.out.println(str3);
		System.out.println(str4);
	}

}
