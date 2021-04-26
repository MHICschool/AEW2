package MySQLTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
	 private Connection connect = null;
	 private Statement statement = null;
	 private PreparedStatement preparedStatement = null;
	 private ResultSet resultSet = null;
	
	 
	 final private String host = "192.168.178.96:3306";
	 final private String user = "root";
	 final private String passwd = "d4t3nb4nk";
	 
	 public void readDataBase() throws Exception {
		    try {
		    	Class.forName("com.mysql.cj.jdbc.Driver");
		    	
		    	connect = DriverManager.getConnection("jdbc:mysql://" + host + "/Kundenverwaltung" + "?user=" + user + "&password=" + passwd );
		    	
		    	statement = connect.createStatement();
		    	
		    	 resultSet = statement
		    	          .executeQuery("select * from KundenData");
		    	      writeResultSet(resultSet);
		    	      
		    } catch (Exception e) {
		        throw e;
		      } finally {
		        close();
		      }
		    }



	 	private void writeResultSet(ResultSet resultSet) throws SQLException {
		    // ResultSet is initially before the first data set
		    while (resultSet.next()) {		      	      
		      int id = resultSet.getInt("id");
		      String vorname  = resultSet.getString("vorname");
		      String nachname = resultSet.getString("nachname");
		      //Date date = resultSet.getDate("datum");
		      String adresse = resultSet.getString("adresse");
		      String wohnort = resultSet.getString("wohnort");
		      String postleitzahl = resultSet.getString("postleitzahl");
		      String telefonnummer = resultSet.getString("telefonnummer");
		      System.out.println("id: " + id);
		      System.out.println("Vorname: " + vorname);
		      System.out.println("Nachname: " + nachname);
		      System.out.println("Adresse: " + adresse);
		      System.out.println("Wohnort: " + wohnort);
		      System.out.println("Postleitzahl: " + postleitzahl);
		      System.out.println("Telefonnummer: " + telefonnummer);
		    }
		  }
	 	
	 	private void close() {
	 	    try {
	 	      if (resultSet != null) {
	 	        resultSet.close();
	 	      }

	 	      if (statement != null) {
	 	        statement.close();
	 	      }

	 	      if (connect != null) {
	 	        connect.close();
	 	      }
	 	    } catch (Exception e) {

	 	    }
	 	  }


}




