package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {
	 public static void main(String[] args) throws SQLException, ClassNotFoundException{
		 SqliteConnection connection=new SqliteConnection();
		 connection.setConnection();
		 Statement statement=connection.getStatement();
		 statement.setQueryTimeout(30);
		 
		
		 statement.executeUpdate("insert into person values(3, 'dhenry')");
			statement.executeUpdate("insert into person values(4, 'Randa1thor')");
			ResultSet rs = statement.executeQuery("select * from person");
			while (rs.next()) {
				// read the result set
				System.out.println("name = " + rs.getString("name"));
				System.out.println("id = " + rs.getInt("id"));
			}
		 
		 
		 
		 
		 
	 }
}
