package sec04.exam05_bit;

public class BitLogicExample {

	public static void main(String[] args) {                         //3�� 15page Ȯ���ϸ� &|^Ȯ�ΰ���
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		//00101101 = 45
		//00011001 = 25
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		//System.out.println("||");
		System.out.println(toBinaryString(45&25)); }
		
	public static String toBinaryString(int value) {
		String string = Integer.toBinaryString(value);
		while(string.length() < 32) {
			string = "0" + string;
		}
		return string;
	}

}
