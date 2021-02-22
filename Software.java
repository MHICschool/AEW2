public class Software {

    private int id;
    private String name;
    private String zugangsdaten;
    private String password;
    private String beschreibung;


    public Software(int id, String name, String zugangsdaten, String password, String beschreibung) {

        this.id = id;
        this.name = name;
        this.zugangsdaten = zugangsdaten;
        this.password = password;
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

    public String getZugangsdaten() {
        return zugangsdaten;
    }

    public void setZugangsdaten(String zugangsdaten) {
        this.zugangsdaten = zugangsdaten;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public static Software softwareEinstellen(int id, String name, String zugangsdaten, String password, String beschreibung) {
        return new Software(id, name, zugangsdaten, password, beschreibung);
    }
}
