package LPS_Niklas_Jordan_SMIB;

/**
 * The type Wiki buch.
 * @Override Stringbuilder für Regal und Kapitel
 */
public class WikiBuch extends Buch {
    private String regal;
    private String kapitel;

    /**
     * Gets regal.
     *
     * @return the regal
     */
    public String getRegal() {
        return regal;
    }

    /**
     * Sets regal.
     *
     * @param regal the regal
     */
    public void setRegal(String regal) {
        this.regal = regal;
    }

    /**
     * Gets kapitel.
     *
     * @return the kapitel
     */
    public String getKapitel() {
        return kapitel;
    }

    /**
     * Sets kapitel.
     *
     * @param kapitel the kapitel
     */
    public void setKapitel(String kapitel) {
        this.kapitel = kapitel;
    }

    @Override
    public String toString() {
        return "Regal: " + this.regal + "\nKapitel: " + this.kapitel;
    }
}
