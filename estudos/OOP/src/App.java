public class App {
    public static void main(String[] args) throws Exception {

        //abstração é utilizado esconder os detalhes das classes
        User firstUser = new User("Pedro Emanuel", "2001-09-02" ); 
        Book book = new Book("What every body is saying", "Joe Navarro", 250);
        AudioBook audioBook = new AudioBook("The art of war", "Sun Tzu", 93);
        Ebook eBook = new Ebook("Dracula", "Bram Stoker", 270 , ".pdf");
        // Sem abstração
        // Book book = new Book();
        // book.title = "What every body is saying";
        // book.author = "Joe Navarro";
    
        firstUser.borrow(book);
        firstUser.borrow(audioBook);
        firstUser.borrow(eBook);



        System.out.printf("%s nasceu em %s e agora tem %s anos %n", firstUser.getName(), firstUser.getBirthDay(), firstUser.age());

        System.out.printf("%s has borrowed these books: %s %n", firstUser.getName(), firstUser.borrowedBooks());

    }
}
