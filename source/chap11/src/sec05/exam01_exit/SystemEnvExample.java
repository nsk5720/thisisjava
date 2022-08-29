package sec05.exam01_exit;

public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("jAVA_ HOME");
		System.out.println("[ JAVA_HOME ] " + javaHome);

	}

}
