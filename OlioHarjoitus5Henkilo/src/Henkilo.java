/**
 * luokka henkilo
 * 
 * @author Joonas
 * 
 */
public class Henkilo {
    private String nimi;
    /** yksityinen atribuutti */
    private String osoite;
    /** yksityinen atribuutti */
    private int ika;
    /** yksityinen atribuutti */
    private String puhNum;

    /** yksityinen atribuutti */

    /**
     * luokan konstruktori tahan voisi laittaa parametreja
     */
    public Henkilo() {

    }

    public Henkilo(String nimi, String osoite, int ika, String puhNum) {
        this.nimi = nimi;
        this.osoite = osoite;
        this.ika = ika;
        this.puhNum = puhNum;
    }

    /**
     * Asetetaan ikä parametriin
     * 
     * @param ika
     */
    public void setIka(int ika) {
        this.ika = ika;
    }

    /**
     * Asetetaan nimi
     * 
     * @param nimi
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * Asetetaan osoite
     * 
     * @param osoite
     */
    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    /**
     * Asetetaan puhelinnumero
     * 
     * @param puhNum
     */
    public void setPuhNum(String puhNum) {
        this.puhNum = puhNum;
    }

    /**
     * palauttaa ian
     * 
     * @return ika
     */
    public int getIka() {
        return ika;
    }

    /**
     * palauttaa nimen
     * 
     * @return nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * palauttaa osoitteen
     * 
     * @return osoite
     */
    public String getOsoite() {
        return osoite;
    }

    /**
     * palauttaa puhelinnumeron
     * 
     * @return puhNum
     */
    public String getPuhNum() {
        return puhNum;
    }

    /**
     * palauttaa uuden Henkilo tyypin kopion
     * 
     * @return Henkilo kopio
     */
    public Henkilo copy() {
        return new Henkilo(nimi, osoite, ika, puhNum);
    }

    /**
     * vertaa onko olioiden tiedot samanlaisia
     * 
     */
    @Override
    public boolean equals(Object verrattava) {
        if (verrattava == null) {
            return false;
        }
        if (getClass() != verrattava.getClass()) {
            return false;
        }
        Henkilo valiaikainen = (Henkilo) verrattava;
        if (this.ika == valiaikainen.ika && this.nimi == valiaikainen.nimi && this.osoite == valiaikainen.osoite
                && this.puhNum == valiaikainen.puhNum) {
            return true;
        } else {
            return false;
        }

    }
    /**
     * toString metodissa tiedot eritelty valilyonnilla.
     * jarjestys nimi puhNum osoite ika
     */

    @Override
    public String toString() {

        return nimi + " " + puhNum + " " + osoite + " " + ika;
    }

}
