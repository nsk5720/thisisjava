package sec04.exam02_super;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	public int flymode = NORMAL;                   /*�ٲ���ؼ� final�Ⱦ�*/
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			//Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
		}
	}
}
