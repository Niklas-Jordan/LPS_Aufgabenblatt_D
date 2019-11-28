package LPS_Niklas_Jordan_SMIB;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WebsiteDaten { //revision

    private Date timestamp;
    private WebsiteUserData contributor;

    public WebsiteUserData getContributor() {
        return contributor;
    }

    public void setContributor(WebsiteUserData contributor) {
        this.contributor = contributor;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy 'um' HH : mm 'Uhr' (z)");
        return "Urheber: " + this.contributor + System.lineSeparator() + "Letzte Änderung: " + dateFormat.format(timestamp);
    }
}
