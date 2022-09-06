package jdbcConnection;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		Connection connection=null;
		
		Statement statement=null;
		

//		CreateTable obj=new CreateTable();
		
		Connectionjdbc obj=new Connectionjdbc();
		
		connection = obj.get_connection();
		
		try {
			
			String query="create table person(name varchar(20) not null, age int not null , gender varchar(20))";
			
			statement=connection.createStatement();
			
			statement.executeUpdate(query);
			
			System.out.println("succesfully executed");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
