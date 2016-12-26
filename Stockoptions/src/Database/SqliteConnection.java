package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteConnection {
	
	private Connection connection;
	
	
	//change with another note
	
	
	public Statement getStatement() throws SQLException {
		if (connection==null)
			return null;
		
		return connection.createStatement();
	}
	
	public void setConnection() throws ClassNotFoundException {
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");
		this.connection = null;
		
		try{
			// create a database connection
			this.connection = DriverManager
					.getConnection("jdbc:sqlite::resource:stocks.db");
		}catch(SQLException e){
			// if the error message is "out of memory",
						// it probably means no database file is found
						System.err.println(e.getMessage());
		}	
		
	}
	
	public void closeConnection(){
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			// connection close failed.
			System.err.println(e);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {//just a executable that tests the connection
		
		SqliteConnection sqliteconn=new SqliteConnection();

		
		try {
			sqliteconn.setConnection();
			Statement statement = sqliteconn.getStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			statement.executeUpdate("drop table if exists person");
			statement
					.executeUpdate("create table person (id integer, name string)");
			statement.executeUpdate("insert into person values(1, 'leo')");
			statement.executeUpdate("insert into person values(2, 'yui')");
			ResultSet rs = statement.executeQuery("select * from person");
			while (rs.next()) {
				// read the result set
				System.out.println("name = " + rs.getString("name"));
				System.out.println("id = " + rs.getInt("id"));
			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			sqliteconn.closeConnection();
		}
	}
}
