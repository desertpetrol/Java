public class Ebook extends Book {
    private String format;

    Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount); //super chama o método construtor da classe pai
        this.format = format;
    }
    
}