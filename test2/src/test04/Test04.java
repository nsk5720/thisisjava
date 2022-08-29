package test04;

public class Test04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,55555,3,4244458,27882002};
			for(int i = 0; i<array.length; i++) {
				if(max<array[i]) {
					max=array[i];
				}
			}
		System.out.println("Max: " + max);
	}

}
