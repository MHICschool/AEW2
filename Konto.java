public class Konto {


     private String besitzername;
     private double kontostand;

    public Konto(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setBesitzername(String besitzername) {
        this.besitzername = besitzername;
    }

    public String getBesitzername() {
        return besitzername;
    }

    public void abheben (double betrag ) {

        if (betrag > kontostand) {
            System.out.println("Konto nicht gedeckt!");
        }
        else {
            kontostand -= betrag;
        }
    }


    public void einZahllen(double betgrag) {

        kontostand += betgrag;
    }

}

