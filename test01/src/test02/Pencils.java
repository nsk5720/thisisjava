package test02;

public class Pencils {

	public static void main(String[] args) {
		int pencils = 534;
		int student = 30;
		
		//�л� �� ���� ������ ���� ��
		int pencilsPerStudent = (pencils / student);
		System.out.println(pencilsPerStudent);

		//���� ���� ��
		int pencilsLeft = (pencils % student);
		System.out.println(pencilsLeft);
	}

}