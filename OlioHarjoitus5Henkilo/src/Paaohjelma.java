import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Esimerkki henkilon juha luonti");
        Henkilo juha = new Henkilo("Juha", "tie 3", 45, "044");
        System.out.println();

        System.out.println("henkiloiden luonti");
        Henkilo pera = new Henkilo();
        pera = tietojenSyotto(lukija);
        Henkilo jonne = new Henkilo();
        jonne = tietojenSyotto(lukija);
        System.out.println();

        System.out.println("Sami kopioidaan juhasta");
        Henkilo sami = juha.copy();
        System.out.println();

        System.out.println("henkiloiden tulostus");
        System.out.println(juha.toString());
        System.out.println(pera.toString());
        System.out.println(jonne.toString());
        System.out.println(sami.toString());
        System.out.println();
        
        System.out.println("verrataan juhaa ja samia");
        System.out.println(juha.equals(sami));
        System.out.println("muutetaan Samin nimi");
        sami.setNimi("Sami");
        System.out.println();
        System.out.println("tulostetaan sami, juha ja heidan vertaus");
        System.out.println(sami.toString());
        System.out.println(juha.toString());
        System.out.println(juha.equals(sami));

        lukija.close();

    }

    public static Henkilo tietojenSyotto(Scanner lukija) {
        Henkilo uusiHenkilo = new Henkilo();
        System.out.println("Anna henkilon nimi");
        String nimi = lukija.nextLine();
        System.out.println("Anna henkilon puhelinnumero");
        String puhNum = lukija.nextLine();
        System.out.println("Anna henkilon osoite");
        String osoite = lukija.nextLine();
        System.out.println("Anna henkilon ika");
        int ika = lukija.nextInt();
        lukija.nextLine(); // muista lisätä tää muuten ei toimi!!

        uusiHenkilo.setNimi(nimi);
        uusiHenkilo.setPuhNum(puhNum);
        uusiHenkilo.setOsoite(osoite);
        uusiHenkilo.setIka(ika);

        return uusiHenkilo;
    }

}
