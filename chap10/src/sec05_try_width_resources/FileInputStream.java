package sec05_try_width_resources;

public class FileInputStream implements AutoCloseable {	//AutoCloseable ���(?)���п� close�޼ҵ� ����ǰ� ����ó���ڵ� �����
	private String file;
	public FileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file +"�� �ݽ��ϴ�.");
		
	}
}
