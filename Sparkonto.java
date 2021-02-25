public class Sparkonto extends Konto {

    private double zinSatz;


    public Sparkonto(double kontostand, double zinSatz) {
        super(kontostand);
        this.zinSatz = zinSatz;
    }

    public void zinsenAnrechnen() {
        double zinsen = super.getKontostand() * this.zinSatz/ 100;
        super.einZahllen(zinsen);
    }
}
