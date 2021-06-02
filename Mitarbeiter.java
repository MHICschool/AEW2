package Projekt;

public class Mitarbeiter {

String passwort;
String abteilung;
public String getPasswort() {
	return passwort;
}
public void setPasswort(String passwort) {
	this.passwort = passwort;
}
public String getAbteilung() {
	return abteilung;
}
public void setAbteilung(String abteilung) {
	this.abteilung = abteilung;
}
	
public static Kunde neuenKundenAnlegen (int id, String vorname, String nachname, String address, String wohnort, String postleitzahl, String telefonnummer){
	
	Kunde neuerkunde = new Kunde(id,vorname,nachname,address,wohnort,postleitzahl,telefonnummer);
	return neuerkunde;
	}
public void kundenBearbeiten(Kunde kunde ) {
	} 
public void kundenLoeschen(Kunde kunde ) {
	}
}
