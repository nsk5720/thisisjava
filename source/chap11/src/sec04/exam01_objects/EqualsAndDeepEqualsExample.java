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
		System.out.println(Objects.equals(null, null));			/*주의: 아무것도 넣지 않은 경우에도 true가 나옴*/
		System.out.println(Objects.equals(o1, o2) + "\n");
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2));			//다르게 인식
		System.out.println(Objects.deepEquals(arr1, arr2));			//배열은 deepEquals써야함
		System.out.println(Arrays.deepEquals(arr1, arr2));		//objects = arrays 배열에선 같음
		
		System.out.println(Objects.equals(null, arr2));
		System.out.println(Objects.equals(arr1, null));
		System.out.println(Objects.equals(null, null));
	}

}
