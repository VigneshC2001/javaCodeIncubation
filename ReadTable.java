package day8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadTable {

	public static void main(String[] args) throws IOException, SQLException {
		
		Connectionjdbc obj=new Connectionjdbc();
		
		Connection connection=null;
		
		connection=obj.get_connection();
		
		Statement statement=null;
		
		ResultSet rs=null;
		
		String query="select * from trial";
		
		statement=connection.createStatement();
		
		rs=statement.executeQuery(query);
		
		ResultSetMetaData rsm=rs.getMetaData();
		
		int count=rsm.getColumnCount();
		
		for(int i=1;i<=count ;i++) {
			
			System.out.print(rsm.getColumnName(i)+"\t");
		}
		
		System.out.println("");
		while(rs.next()) {
			
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		
	}

}
