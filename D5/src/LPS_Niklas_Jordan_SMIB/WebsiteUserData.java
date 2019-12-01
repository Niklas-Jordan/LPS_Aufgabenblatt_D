package LPS_Niklas_Jordan_SMIB;

/**
 * The type Website user data.
 * Im @Override wird überprüft ob Username und oder IP vorhanden ist und dann ausgegeben, bzw entsprechende Fehlermeldung ausgegeben
 */
public class WebsiteUserData {
    private String username;
    private String ip;

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets ip.
     *
     * @param ip the ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        if (username == null && ip == null) {
            return "Fehler kein Benutzer vorhanden!";
        } else if (ip != null) {
            return ip + "IP";
        } else if (username != null) {
            return username;
        } else {
            return ip + "von" + username;
        }
    }
}
