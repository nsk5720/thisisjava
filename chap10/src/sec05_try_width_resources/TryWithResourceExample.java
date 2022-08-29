package sec05_try_width_resources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();								//������ �а� �ݰ� ����ó���ڵ���� �Ǿ�� ��
			throw new Exception();					//throw ���� ���� �߻�
		} catch(Exception e ) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}

	}

}
