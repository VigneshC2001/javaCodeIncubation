package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionjdbc {

	 public static void main(String[] args) {
	       
		 
		Connectionjdbc connection=new Connectionjdbc();
		
		System.out.println(connection);
	    }
	 
	 public Connection get_connection() {
		 Connection connection = null;
	        String host="localhost";
	        String port="5432";
	        String db_name="postgres";
	        String username="postgres";
	        String password="password";
	        try {
	            Class.forName("org.postgresql.Driver");
	            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
	            if (connection != null) {
	                System.out.println("Connection OK");
	            } else {
	                System.out.println("Connection Failed");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return connection;
	 }

}
