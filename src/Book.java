public class Book {
    private String titleBook;
    private int yearPublishing;
    private Author authorBook;
    public Book(String titleBook, Author authorBook, int yearPublishing) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearPublishing = yearPublishing;
    }
    public String getTitleBook() {
        return this.titleBook;
    }
    public Author getAuthorBook(){
        return this.authorBook;
    }
    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public void setYearPublishing(int yearPublishing){
        this.yearPublishing = yearPublishing;
    }

}
