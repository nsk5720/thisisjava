package sec08.exam04_overloading;

public class Calculator {             //���ϰ��� �����Ƿ� �޼ҵ���    �׸��� Ŭ���� ���� �ؿ� �����Ƿ� �����ڴ� �ƴ϶�� ���� �� �� ����
	//���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	//���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
