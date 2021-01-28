import java.text.DecimalFormat;
import java.util.Scanner;

public class Tehtava12 {
    /**
     * 
     * Tee yrityksen taloushallinnon järjestelmään ohjelma, joka kysyy käyttäjältä
     * kuinka monta kustannusta (desimaaliluku) syötetään sekä kysyy em. luvut.
     * Ohjelma laskee syötettyjen kustannusten keskiarvon.
     * 
     * @param syote pyydetty merkkijono
     * @return Made by
     * @author jaskjo;
     * @version 1.0
     * @since 2020-09-19
     */
    public static void main(final String[] args) {
        final Scanner lukija = new Scanner(System.in);
        // muuttujien määritys
        int syote1;
        double syote2, summa = 0, keskiarvo = 0;
        // Pyöristyksen alustus kahteen merkitsevään
        DecimalFormat desimaaliMuoto = new DecimalFormat("0.00");
        System.out.println("Kuinka monta kustannusta syotat?");
        syote1 = lukija.nextInt();
        // Tarkisus että lukuja syötetty, nollalla ei voi jakaa
        if (syote1 <= 0) {
            System.out.println("Et syottanyt lukuja");
            // Laskentaan kun luku suurempi kuin nolla
        } else {
            for (int i = 1; i <= syote1; i++) {
                System.out.println("Anna kustannus nro " + i);
                syote2 = lukija.nextDouble();
                if (syote2 < 0) {
                    break;
                } else {
                    summa = summa + syote2;
                    System.out.println("Summa on " + summa);
                }
            }
            lukija.close();
            keskiarvo = summa / syote1;
            if (keskiarvo == 0) {
                System.out.println("keskeytit syottamisen");
            } else {
                //pyöristys tulosteeseen
                System.out.println("Kustannusten keskiarvo on " +desimaaliMuoto.format(keskiarvo));
            }

        }

    }
}
