package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;         // num 3 = 123456780    float�� �� ���� ������ double�� �ٲٸ� 0���� ����   -4�� �����Ⱚ
		num2 = (int) num3;         // num 
		
		int result = num1 - num2;
		System.out.println(result);

	}

}
