package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DemoInsert {

	public static void main(String[] args) {
		//jdbc program insert data onto database
		Connection conn; //hold the Database Connection
		Statement st; //to inject the sql query
		String qry="insert into employee values(1,'java')";
		
		MysqlDataSource ds=new MysqlDataSource();
		//inject all the DB credentials
		ds.setUser("root");//admin user
		ds.setPassword("pass1010");
		ds.setServerName("localhost");
		ds.setPortNumber(3306);
		ds.setDatabaseName("nikhil");
         //get connection
		
		try {
			conn=ds.getConnection();
			//create a statement type object
			st=conn.createStatement();
			int row=st.executeUpdate(qry);
			if(row>0)
				System.out.println("success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
