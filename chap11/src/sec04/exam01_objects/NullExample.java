package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		//System.out.println(Objects.requireNonNull(str2));		������ �ȳ����� �ҷ��� try catch�� �����
		try {
			String name = Objects.requireNonNull(str2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "�̸��� �����ϴ�.");		//ģ���ϰ� �̸��� ���ٰ� �ȳ�
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"�̸��� ���ٴϱ��");		//���ٽ�?
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
