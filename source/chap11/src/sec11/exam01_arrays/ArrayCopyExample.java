package sec11.exam01_arrays;

import java.util.Arrays;

import sec04.exam01_objects.ToStringExample;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);		//1 이상 3 미만
		System.out.println(Arrays.toString(arr3));
		
		//방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);	//원본배열, 원본시작인덱스, 타겟배열, 타겟시작인덱스, 복사개수
		for(int i = 0; i<arr4.length; i++) {
			System.out.println("aar4[" + i + "]=" + arr4[i]);
		}
	}

}
