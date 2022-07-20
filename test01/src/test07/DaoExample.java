package test07;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbwork(new OracleDao());
		dbwork(new MySqlDao());
	}

}
