package sec05_try_width_resources;

public class FileInputStream implements AutoCloseable {	//AutoCloseable 상속(?)덕분에 close메소드 실행되고 예외처리코드 실행됨
	private String file;
	public FileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file +"을 닫습니다.");
		
	}
}
