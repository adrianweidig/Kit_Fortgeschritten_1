
package KIT_Einheiten.bank.klassen;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * Basis Kontoklasse
 *
 * @author Adrian Weidig
 * @since 20.03.2023
 */
public class KontoStamm {
    /***********************/
    /****** Attribute ******/
    /***********************/
    private ArrayList<Buchung> buchungen = new ArrayList<>();
    private Date datum;
    private String kontoinhaber;
    private int kontonummer;
    private double saldo;

    private SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMAN);

    /***********************/
    /**** Konstruktor ******/
    /***********************/

    /***********************/
    /****** Methoden *******/
    /***********************/

    /**
     * Überprüft, ob die Buchung gem. Richtlinien valide ist.
     *
     * @param buchung zu verbuchender Betrag, not null
     * @return Nichts oder den Fehlerstring, not null
     */
    public String buchungspruefung(Buchung buchung) {
        String ergebnis = "FEHLER";

        if (this.saldo + buchung.getBetrag() > 0) {
            ergebnis = "";
        }

        return ergebnis;
    }

    /**
     * @param kontostamm , not null
     * @param buchung    , not null
     * @param fehler     , not null
     * @return , not null
     */
    public String getFehler(KontoStamm kontostamm, Buchung buchung, String fehler) {
        return null;
    }

    /**
     * Setzt alle vorhandenen Kontoinformationen zusammen
     * und gibt diese als ein String zurück.
     *
     * @return die gesamten Kontoinformationen als String, not null
     */
    public String getInfo() {
        String gesamt = "";
        String kontoinformationen = "";

        String str_kontonummer = "Kontonr\t: " + this.kontonummer + "\n";
        String str_kontoart = "Art\t\t: " + this.getClass().getSimpleName() + "\n";
        String str_kontoinhaber = "Inhaber\t: " + this.kontoinhaber + "\n";
        String str_saldo = "Saldo\t: " + this.saldo + "\n";

        kontoinformationen = str_kontonummer + str_kontoart + str_kontoinhaber + str_saldo;
        gesamt = kontoinformationen;

        String str_buchungen = "-----Zugehörige Buchungen----------------------\n";

        for (Buchung buchung : this.buchungen) {
            str_buchungen += "\n" + formatter.format(buchung.getDatum()) + "\t" + buchung.getBetrag();
        }

        gesamt += str_buchungen + "\n";

        return gesamt;
    }

    /**
     * Stößt die Buchungsprüfung, sowie die dazugehörige Buchung an.
     *
     * @param buchung zu verbuchender Betrag, not null
     */
    public void updateSaldo(Buchung buchung) {
        this.saldo += buchung.getBetrag();
        this.buchungen.add(buchung);
    }


    /***********************/
    /** Getter und Setter **/
    /***********************/
    public ArrayList<Buchung> getBuchungen() {
        return buchungen;
    }

    public void setBuchungen(ArrayList<Buchung> buchungen) {
        this.buchungen = buchungen;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public void setKontoinhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
