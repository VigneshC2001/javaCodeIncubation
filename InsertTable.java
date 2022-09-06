package day8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) throws IOException {
		
		Connection connection=null;
		
		Statement statement=null;
		
		Connectionjdbc obj=new Connectionjdbc();
		
		connection=obj.get_connection();
		
		String query="insert into trial values('saran',23),('vicky',22),('mani',25);";
		
		try {
			
			statement=connection.createStatement();
			statement.executeUpdate(query);
			
			System.out.println("value inserted succesfully");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
