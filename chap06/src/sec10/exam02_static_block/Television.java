package sec10.exam02_static_block;

public class Television {
		int feild1;

		private int field1;
	
		static String company = "Samsung";
		static String model = "LCD";
		static String info;
		//static String info = company + "-" + model;	  	//static blockǥ�ù�� ���� �̷��� �ᵵ �Ȱ���
		
		static {                          
			//field1 = 10; (�ȵ�)							//static�� ������ ���̶� ���� �ȵ� (�Ʒ��� �ִ� �޼ҵ�2�� ��������) //static �ȿ� �����Ѱ� �ȵȴٴ� ��!!
			//method 1();  (�ȵ�)
			info = company + "-" + model;					//static block���� ǥ���� ���
		}
		
	/*	static void method() {								//static ������ ��ü�� ������ ���� �ʴ´�
			obj1.company = Television ("LG����")   			//��ü�� ���� ������� ������ ��ü�� ������ �ʾƵ� �����   ����Ŭ�������� ��ü ����(6, 7��)
		}*/
		
		void method1() {
		}
		
		static void method2() { 							//static�� ������ ���̶� ���� �ȵ� 				static �ȿ� �����Ѱ� �ȵȴٴ� ��!!
		//this.field1 = 10; (�ȵ�)
		//this.method1();   (�ȵ�)
		}
		static void method3() {                             //��ü�� �����Լ����� ������ �ʰ� ���⼭ ����� static������ ������ ��ü���� ���
			Television obj = new Television ();
			obj.field1 = 10;
			obj.method1();
		}
}