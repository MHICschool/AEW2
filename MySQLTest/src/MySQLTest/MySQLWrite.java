package MySQLTest;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.SQLException; 
import java.util.Scanner; 
 
public class MySQLWrite { 
	final private String host = "192.168.178.96:3306";
	final private String user = "root";
	final private String passwd = "d4t3nb4nk";
    
	
	public void mySQLWrite(String[] args) throws Exception { 
	
    	Connection connection = null; 
        PreparedStatement pstatement = null; 
        Scanner scanner = null;
        
 
        try { 
             
            scanner = new Scanner(System.in); 
            scanner.useDelimiter("\n");
            int n = 0; 
            System.out.println("Wieviele Kunden sollen der Datenbank hinzugefügt werden?"); 
            n = scanner.nextInt(); 
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/Kundenverwaltung" + "?user=" + user + "&password=" + passwd ); 
             
            if (connection != null) 
            pstatement = connection.prepareStatement("insert into KundenData(vorname, nachname, adresse, wohnort, postleitzahl, telefonnummer) values(?,?,?,?,?,?)"); 
            if (pstatement != null) { 
                for (int i = 1; i <= n; i++) { 
                    System.out.println("Bitte geben Sie die Kundendaten ein!"); 
                    System.out.println(); 
                    System.out.println("Vorname:"); 
                    String vorname = scanner.next(); 
                    System.out.println("Nachname: "); 
                    String nachname = scanner.next(); 
                    System.out.println("Adresse: "); 
                    String adresse = scanner.next(); 
                    System.out.println("Wohnort: "); 
                    String wohnort = scanner.next();
                    System.out.println("Postleitzahl: ");
                    String postleitzahl = scanner.next();
                    System.out.println("Telefonnummer: ");
                    String telefonnummer = scanner.next();
                     
                    pstatement.setString(1, vorname); 
                    pstatement.setString(2, nachname); 
                    pstatement.setString(3, adresse);
                    pstatement.setString(4, wohnort);
                    pstatement.setString(5, postleitzahl);
                    pstatement.setString(6, telefonnummer);
                    int result = pstatement.executeUpdate(); 
                    if (result == 0) { 
                        System.out.println("!Fehler: Kundendaten wurden nicht hinzugefügt!"); 
                    } else { 
                        System.out.println("Daten für " + result + " Kunden wurden zur Datenbank hinzugefügt."); 
                    } 
                } 
            } 
          } catch (SQLException se) { 
            se.printStackTrace(); 
          } catch (Exception ex) { 
            ex.printStackTrace(); 
         } finally { 
            try { 
                if (pstatement != null) { 
                    pstatement.close(); 
                } 
            } catch (SQLException se) { 
                se.printStackTrace(); 
            } 
            try { 
                if (connection != null) { 
                    connection.close(); 
                } 
            } catch (SQLException se) { 
                se.printStackTrace(); 
            } 
        } 
    } 
 
}