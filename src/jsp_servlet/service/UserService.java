package jsp_servlet.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;
import models.User;

public class UserService {
	public boolean validateUser(User user) {
		DBManager db = new DBManager();
		boolean result = false;
		try {
			String sql = "SELECT id FROM user WHERE username=? AND password=?";
			PreparedStatement pstmt = db.conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.addBatch();
			ResultSet rs = pstmt.executeQuery();
			result = rs.first();

			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.close();
		return result;
	}

	public List getAllUser() {
		List userList =new ArrayList();
		DBManager db = new DBManager();
		Statement stmt;
		try {
			stmt = db.conn.createStatement();

			String query = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(query);// 查询返回的结果集对象
			while (rs.next()) {
				User user =new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs
						.getString("username"));
				user.setSex(rs.getString("sex").charAt(0));
				user.setSalary(rs.getFloat("salary"));
				user.setPassword(rs.getString("password"));
				userList.add(user);
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 执行SQL语句的对�?
		db.close();
		return userList;
	}

	public boolean addUser(User user) {
		DBManager db = new DBManager();
		boolean result = false;
		try {
			String sql = "INSERT INTO user(username,password,sex,salary) VALUES(?,?,?,?)";
			PreparedStatement pstmt = db.conn.prepareStatement(sql);

			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setInt(3, user.getSex());
			pstmt.setFloat(4, user.getSalary());
			pstmt.addBatch();
			int rs = pstmt.executeUpdate();
			if (rs > 0) {
				result = true;
			}

			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.close();
		return result;
	}
}
