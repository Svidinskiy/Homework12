import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название: " + this.titleBook + ". Автор: " + this.authorBook + ". Год издания: " + this.yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(titleBook, book.titleBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook);
    }
}
