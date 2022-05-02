

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcexample {
	public static void main(String[] args) throws Exception{
		Class.forName("sql.jdbc.drivrer.sqlDriver");
		Connection con = DriverManager.getConnection("jdbc:mysqlsql:thin:@localhost:1521:xe","rohit","rohit9985");
		Statement stm=con.createStatement();
		int result=stm.executeUpdate("select * from employee");
		System.out.println(result);
		con.close();
	}

}
