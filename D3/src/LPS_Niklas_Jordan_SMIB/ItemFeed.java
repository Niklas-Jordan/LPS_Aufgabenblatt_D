package LPS_Niklas_Jordan_SMIB;

/**
 * @Override gibt Ausgabe an
 * The type Item feed.
 */
public class ItemFeed {

    private String rss;
    private String channel;
    private String title;
    private String link;
    private String description;
    private String language;
    private String copyright;

    /**
     * Gets rss.
     *
     * @return the rss
     */
    public String getRss() {
        return rss;
    }

    /**
     * Sets rss.
     *
     * @param rss the rss
     */
    public void setRss(String rss) {
        this.rss = rss;
    }

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets link.
     *
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets language.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language the language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Gets copyright.
     *
     * @param copyright the copyright
     * @return the copyright
     */
    public String getCopyright(String copyright) {
        return copyright;
    }

    /**
     * Sets copyright.
     *
     * @param copyright the copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        return this.rss + this.channel + this.title + this.link + this.description + this.language + this.copyright;
    }
}