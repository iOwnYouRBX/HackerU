public class Book {
    private String name;
    private String author;
    private int numberOfPages;

    public Book(String name,String author,int numberOfPages){

        this.name = name;
        this.author = author;

        if(numberOfPages < 0 ){
            this.numberOfPages = 1;
        }else{
            this.numberOfPages = numberOfPages;
        }
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }


    public String toString(){
        return  this.name + " By " + this.author + ", " + this.numberOfPages + " pages.";
    }


}
