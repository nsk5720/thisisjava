package sec05_try_width_resources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();								//파일을 읽고 닫고 예외처리코드실행 되어야 함
			throw new Exception();					//throw 예외 강제 발생
		} catch(Exception e ) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
