package LPS_Niklas_Jordan_SMIB;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In Zusammenarbeit mit Florian Eimann
 * The type Website daten.
 *  revision
 * @Override gibt Urheber und Änderungszeitpunkt aus, wenn dieser vorhanden ist
 */
public class WebsiteDaten {

    private Date timestamp;
    private WebsiteUserData contributor;

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
        return "Urheber: " + this.contributor + System.lineSeparator() + "Letzte Änderung: " + dateFormat.format(timestamp);
    }
}
