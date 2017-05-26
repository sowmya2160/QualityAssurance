package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class connectionToDatabase {

	ArrayList<Employee> list = new ArrayList<Employee>();
	public static void main(String[] args)   {
		try{
		//Class.forName("com.mysql.jdbc.driver"); // loads the driver class
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root"); //creates conneection with the database
		Statement st = con.createStatement();// create statement
		ResultSet result = st.executeQuery("select * from employee ");//execute the statement and return the result into the ResultSet
		
while(result.next())//processing the ResultSet
{
	System.out.println(result);
	
}
result.close();
st.close();
con.close();
	}catch(Exception ex){
		System.out.println("Message " + ex);
	}

	}
}
