package pkg24.pkg10.pkg07ora;

public class Music {

    String artist;
    String title;
    Integer min;
    Integer sec;

    public Music(String artist, String title, Integer min, Integer sec) {
        this.artist = artist;
        this.title = title;
        this.min = min;
        this.sec = sec;
    }

    //getter
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getSec() {
        return sec;
    }

    //setter
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public void setSec(Integer sec) {
        this.sec = sec;
    }

    public String getDetails() {
        String formattedSec = this.sec.toString();
        if (this.sec < 10) {
            formattedSec = "0" + this.sec;
        }
        return this.artist + " - " + this.title + " - " + this.min + ":" + this.sec;
    }
    
    public Integer getLengthInSec(){
        return this.min * 60 + this.sec;
    }

}
