package jsp_servlet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	public Connection conn;

	public DBManager() {
		init();
	}

	public void init() {
		// System.out.println("open DB");
		// 注册JDBC驱动
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 建立与DB的连�?
		try {
			conn = DriverManager.getConnection(
					"jdbc:MySQL://localhost:3306/class3", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void close() {
		// System.out.println("close DB");
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void info() {
		try {
			System.out.println("is closed:" + conn.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// DBManager db = new DBManager();
		// db.info();
		// db.close();
	}
}
