package Projekt;

import java.util.ArrayList;

public class Kunde extends Person{

	 ArrayList<Hardware> hardwareliste = new ArrayList<Hardware>();
	    ArrayList<Software> softwareliste = new ArrayList<Software>();


	    public Kunde(int id, String vorname, String nachname, String address, String wohnort, String postleitzahl, String telefonnummer) {
	        super(id, vorname, nachname, address, wohnort, postleitzahl, telefonnummer);
	    }

	    public boolean hardwareaddieren(Hardware hardware) {

	        if (hardwareliste.contains(hardware)) {

	            System.out.println("Hardware ist bereits in die Liste");
	            return false;
	        }
	        hardwareliste.add(hardware);
	        return true;
	    }

	    public boolean softwareaddieren(Software software) {

	        if (softwareliste.contains(software)) {
	            System.out.println("Software ist bereits in die Liste");
	            return false;
	        }
	        softwareliste.add(software);
	        return true;

	    }

	    public void softwareaktualisiren(Software zugangdaten, Software nuezugangdaten) {

	        this.softwareliste.set(zugangdaten.getId()  , nuezugangdaten);
	        System.out.println("Zugansdaten aktualisiert");


	    }


	    public boolean hardwareEntfernen(Hardware hardware) {
	        if (hardwareliste.contains(hardware)){
	            System.out.println("Diese Objekt wurde nicht gefunden");
	            return false;

	        }
	        this.hardwareliste.remove(hardware);
	        return true;
}
