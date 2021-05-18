package practice.ddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils {
	@Test
	public void getExecuteQuery() throws SQLException
	{
		//Step1:Register the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		//Step2:Establish Connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","root");
		
		//Step3:Issue create statement
	    Statement stat = con.createStatement();
	    
	    //Step4:Execute any query
	    ResultSet result=stat.executeQuery("select *from Customers1;");
	    while(result.next())
	    {
	    	System.out.println(result.getString(1));
	    }
	    
	    //Step5:Close database connection
	    con.close();
	}

}
