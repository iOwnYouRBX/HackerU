public class Word {
    private String hebrew;
    private String english;
    public Word(String heb, String eng){
        this.hebrew = heb;
        this.english = eng;
    }

    public String getHebrew(){
        return this.hebrew;
    }
    public void setHebrew(String heb){
        this.hebrew = heb;
    }

    public String getEnglish(){
        return  this.english;
    }
    public void setEnglish(String eng){
        this.english = eng;
    }

    public String toString(){
        return this.hebrew + ":" + this.english;
    }

}
