package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int [] scores = {83, 90, 87};                 //�迭 ���� �ϴ� ��   = int scores []
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for(int i = 0; i<3; i++) {                   //i<=3 ���� �ȵ� 3���� ���ϱ� 4�� ��
			sum += scores[i];
		}
		System.out.println("����: " + sum);
		double avg = (double) sum / 3;
		System.out.println("���: " + avg);
	}

}
