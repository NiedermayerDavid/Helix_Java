package niedermayer_david_oop_dolgozat;

public class Music {

    private String title;
    private String author;
    private String contributor;
    private Integer minute;
    private Integer second;
    private String properties;
    

    public Music(String title, String author, String contributor, Integer minute, Integer second, String properties) {
        this.title = title;
        this.author = author;
        this.contributor = contributor;
        this.minute = minute;
        this.second = second;
        this.properties = properties;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContributor() {
        return contributor;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getSecond() {
        return second;
    }

    public String getProperties() {
        return properties;
    }

    
    @Override
    public String toString(){
        return (
                this.title +
                "\n  • Cím: " + this.title +
                "\n  • Előadó: " + this.author +
                "\n  • Közreműködő: " + this.contributor +
                "\n  • Perc: " + this.minute  +
                "\n  • Másodperc: " + this.second +
                "\n  • Tulajdonságok: " + this.properties + "\n"
                );
        
    }
}
