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
		String sql = "SELECT * FROM grade;";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			System.out.printf("Sid=%s ", resultSet.getString("sid"));
			System.out.printf("Sname=%s ", resultSet.getString("sname"));
			System.out.printf("Sage=%s ", resultSet.getString("sage"));
			System.out.printf("Ssex=%s ", resultSet.getString("ssex"));
			System.out.printf("Math=%s ", resultSet.getString("math"));
			System.out.printf("Chinese=%s ", resultSet.getString("chinese"));
			System.out.printf("English=%s ", resultSet.getString("English"));
			System.out.printf("Cid=%s ", resultSet.getString("cid"));
			System.out.println();
		}
//        6.�ͷ�����
		resultSet.close();
		statement.close();
		connection.close();
	}
}
