public class AudioBook extends Book {
    //herança 
    private int runTime;
    
    AudioBook(String title, String author, int runTime) {
        super(title, author, 0); //super chama o método construtor da classe pai
        this.runTime = runTime;
    }
    
}
