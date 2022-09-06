package day8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) throws IOException, SQLException {
		
		Connection con=null;
		
		Statement st=null;
		
		ResultSet rs=null;
		
		Connectionjdbc obj=new Connectionjdbc();
		
		 con=obj.get_connection();
		 
		 String query="update trial set age=143 where name='vicky'";
		 
		 st=con.createStatement();
		 st.executeUpdate(query);
		 
		 System.out.println("updated succesfully");
		 
		 st=con.createStatement();
		 
		 rs=st.executeQuery("select * from trial");
		 
		 ResultSetMetaData rsm=rs.getMetaData();
		 
		 int count=rsm.getColumnCount();
		 
		 for(int i=1;i<=count;i++) {
			 
			 System.out.print(rsm.getColumnName(i)+"\t");
			 
		 }
		 System.out.println("\n");
		 while(rs.next()) {
			 System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		 }
	}

}
