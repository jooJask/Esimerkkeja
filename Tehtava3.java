
/*Esittely tekemästäni tehtävästä.
@author (C)JoonasJaskari 13.9.2020
*/

public class Tehtava3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double nettoHinta = 0.0, bruttoHinta = 0.0, alv = 0.0;

        System.out.println("Tervehdys tasamaantallaaja");
        System.out.print("Syöttäisitkö tuotteen nettohinnan\n> ");
        nettoHinta = Double.valueOf(lukija.nextLine());

        System.out.print("Syöttäisitkö alv-prosentin\n> ");

        alv = Double.valueOf(lukija.nextLine());
        bruttoHinta = (nettoHinta + ((alv / 100) * nettoHinta));
        System.out.println("Bruttohinta on: " + bruttoHinta + " €");
        lukija.close();
    }
}
