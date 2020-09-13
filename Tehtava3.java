
/*Esittely tekemästäni tehtävästä.
@author (C)JoonasJaskari 13.9.2020
*/

public class Tehtava3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Muuttujien alustus
        double muuttuja1 = 0.0, muuttuja2 = 0.0, muuttuja3 = 0.0;
        // Ohjelma alkaa
        System.out.println("Tervehdys");
        System.out.print("Syöttäisitkö muuttujan yksi\n> ");
        // Muuttujien
        muuttuja1 = Double.valueOf(lukija.nextLine());
        System.out.print("Syöttäisitkö muuttujan kolme\n> ");
        muuttuja3 = Double.valueOf(lukija.nextLine());
        muuttuja2 = (muuttuja1 + ((muuttuja3 / 100) * muuttuja1));
        System.out.println("muuttuja2 on: " + muuttuja2 + " yksikkoa");
        lukija.close();
    }
}
