package chap07.sec02.exam01_inheritance;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		//DmbCellphone ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���",  "����",  10);
		
		//Cellphone���κ��� ��� ���� �ʵ�
		System.out.println("��: " + dmbCellphone.model);
		System.out.println("����: " + dmbCellphone.color);
		
		//DmbCellphone�� �ʵ�
		System.out.println("ä��: " + dmbCellphone.channel);
		
		//cellphone���κ��� ��� ���� �޼ҵ� ȣ��
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellphone.sendVoice("��~ ��  �ݰ����ϴ�.");
		dmbCellphone.hangup();
		
		//DmbCellphone�� �޼ҵ� ȣ��
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

	}

}
