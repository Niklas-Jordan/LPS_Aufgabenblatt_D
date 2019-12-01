package LPS_Niklas_Jordan_SMIB;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In Zusammenarbeit mit Florian Eimann
 * The type Website daten.
 * revision
 *
 * @Override Stringbuilder für Autor, Änderungszeit und Speicherort
 */
public class WebsiteDaten {

    private Date timestamp;
    private WebsiteUserData contributor;
    private WikiBuch speicher;

    /**
     * Gets speicher.
     *
     * @return the speicher
     */
    public WikiBuch getSpeicher() {
        return speicher;
    }

    /**
     * Sets speicher.
     *
     * @param speicher the speicher
     */
    public void setSpeicher(WikiBuch speicher) {
        this.speicher = speicher;
    }

    /**
     * Gets contributor.
     *
     * @return the contributor
     */
    public WebsiteUserData getContributor() {
        return contributor;
    }

    /**
     * Sets contributor.
     *
     * @param contributor the contributor
     */
    public void setContributor(WebsiteUserData contributor) {
        this.contributor = contributor;
    }

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy 'um' HH : mm 'Uhr' (z)");
        return speicher + "\nUrheber: " + this.contributor + System.lineSeparator() + "Letzte Änderung: " + dateFormat.format(timestamp);
    }
}
