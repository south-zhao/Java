import java.sql.*;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/9/24 15:02
 * @File: sql.java
 * @Describe: 进行java与MySQL之间的连接测试
 * -*- coding: gbk -*-
 */


public class sql {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        1.加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
//        2.用户信息和url
		String url = "jdbc:mysql://localhost:3306/db?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String username="root";
		String password="root";
//        3.连接成功，数据库对象 Connection
		Connection connection = DriverManager.getConnection(url,username,password);
//        4.执行SQL对象Statement，执行SQL的对象
		Statement statement = connection.createStatement();
//        5.执行SQL的对象去执行SQL，返回结果集
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
//        6.释放连接
		resultSet.close();
		statement.close();
		connection.close();
	}
}
