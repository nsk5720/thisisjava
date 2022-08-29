package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = { {1,2}, {3,4} };
		
		//얕은 복사 후 비교
		System.out.println("[얕은 복제 후 비교]");			//객체는 힙영역의 주소만(복사함) 주소를 통해 실제 값을 가지고 있음
		int[][] cloned1 = Arrays.copyOf(original, original.length);		//클론1에 배열번지만 들어감
		System.out.println("배열 번지 비교: " + original.equals(cloned1));	//배열 번지만 비교해서 다름
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));		//안에 내용 비교
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		//깊은 복사 후 비교
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: " + original.equals(cloned2));	
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));	
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
	}

}
