package Projekt;

public class Hardware {

private int id;
private String name;
private String ipAddress;
private String passwort;
private String beschreibung;

public Hardware(int id, String name, String ipAddress, String passwort, String beschreibung) {
    this.id = id;
    this.name = name;
    this.ipAddress = ipAddress;
    this.passwort = passwort;
    this.beschreibung = beschreibung;
}


public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}


public String getIpAddress() {
    return ipAddress;
}

public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
}

public String getPasswort() {
    return passwort;
}

public void setPasswort(String passwort) {
    this.passwort = passwort;
}

public String getBeschreibung() {
    return beschreibung;
}

public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
}

public static Hardware hardwareConfigurieren(int id, String name, String ipAddress, String passwort, String beschreibung) {
    return new Hardware(id, name, ipAddress, passwort, beschreibung);
}

}

