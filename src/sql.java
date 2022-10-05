import java.sql.*;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/9/24 15:02
 * @File: sql.java
 * @Describe: ����java��MySQL֮������Ӳ���
 * -*- coding: gbk -*-
 */


public class sql {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        1.��������
		Class.forName("com.mysql.cj.jdbc.Driver");
//        2.�û���Ϣ��url
		String url = "jdbc:mysql://localhost:3306/db?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String username="root";
		String password="root";
//        3.���ӳɹ������ݿ���� Connection
		Connection connection = DriverManager.getConnection(url,username,password);
//        4.ִ��SQL����Statement��ִ��SQL�Ķ���
		Statement statement = connection.createStatement();
//        5.ִ��SQL�Ķ���ȥִ��SQL�����ؽ����
		String sql = "SELECT *FROM grade;";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			System.out.println("SNo="+resultSet.getString("sid"));
			System.out.println("SName="+resultSet.getString("sname"));
			System.out.println("Birth="+resultSet.getString("sage"));
			System.out.println("SPNo="+resultSet.getString("ssex"));
			System.out.println("Major="+resultSet.getString("math"));
			System.out.println("Grade="+resultSet.getString("chinese"));
			System.out.println("SInstructor="+resultSet.getString("English"));
			System.out.println("SPwd="+resultSet.getString("cid"));
		}
//        6.�ͷ�����
		resultSet.close();
		statement.close();
		connection.close();
	}
}
