package LPS_Niklas_Jordan_SMIB;

/**
 * The type Website.
 * erbt von Klasse: ElektronischesMedium
 */
public class Website extends ElektronischesMedium {

    private WebsiteDaten neusteWebsiteDaten;

    /**
     * Gets neuste website daten.
     *
     * @return the neuste website daten
     */
    public WebsiteDaten getNeusteWebsiteDaten() {
        return neusteWebsiteDaten;
    }

    /**
     * Sets neuste website daten.
     *
     * @param neusteWebsiteDaten the neuste website daten
     */
    public void setNeusteWebsiteDaten(WebsiteDaten neusteWebsiteDaten) {
        this.neusteWebsiteDaten = neusteWebsiteDaten;
    }
}

