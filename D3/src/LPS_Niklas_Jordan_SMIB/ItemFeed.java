package LPS_Niklas_Jordan_SMIB;

public class ItemFeed {

    private String rss;
    private String channel;
    private String title;
    private String link;
    private String description;
    private String language;
    private String copyright;

    public String getRss() {
        return rss;
    }

    public void setRss(String rss) {
        this.rss = rss;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getCopyright(String copyright) {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        return this.rss + this.channel + this.title + this.link + this.description + this.language + this.copyright;
    }
}