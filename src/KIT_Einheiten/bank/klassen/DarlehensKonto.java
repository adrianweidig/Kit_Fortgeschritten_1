package KIT_Einheiten.bank.klassen;

/**
 * @author Adrian Weidig
 * @since 20.03.2023
 */
public class DarlehensKonto extends KontoStamm {
    /***********************/
    /****** Attribute ******/
    /***********************/
    private double rate;

    /***********************/
    /**** Konstruktor ******/
    /***********************/

    /***********************/
    /****** Methoden *******/
    /***********************/
    @Override
    public String buchungspruefung(Buchung buchung) {
        return null;
    }

    /***********************/
    /** Getter und Setter **/
    /***********************/
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
