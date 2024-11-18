package JDBCDEMO;

import java.sql.*;
// import package  java sql connection
// load and register Driver
// establish connection
// create statement
// execute query
// process the result
// close the connection

public class DemoClass {
	
	public static void main(String[] args) throws Exception {
		
		String url ="jdbc:mysql://localhost:3306/studentdatabase" ;
		String username = "root";
		String password ="";
		String query = "select name from studentTable where id=1";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");  //register the driver here
		
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		String name1 = rs.getString("name");
		
		System.out.println(name1);
		
		st.close();
		con.close();
		
		
		
	}

}
