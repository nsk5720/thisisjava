package sec04.exam01_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));			/*����: �ƹ��͵� ���� ���� ��쿡�� true�� ����*/
		System.out.println(Objects.equals(o1, o2) + "\n");
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2));			//�ٸ��� �ν�
		System.out.println(Objects.deepEquals(arr1, arr2));			//�迭�� deepEquals�����
		System.out.println(Arrays.deepEquals(arr1, arr2));		//objects = arrays �迭���� ����
		
		System.out.println(Objects.equals(null, arr2));
		System.out.println(Objects.equals(arr1, null));
		System.out.println(Objects.equals(null, null));
	}

}
