package day8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {

	public static void main(String[] args) throws IOException, SQLException {
		
Connection con=null;
Statement st=null;
ResultSet rs=null;
ResultSetMetaData rsm=null;

Connectionjdbc obj=new Connectionjdbc();

con=obj.get_connection();

st=con.createStatement();
st.executeUpdate("delete from trial where age=24");

System.out.println("deleted sucessfully");

	}

}
