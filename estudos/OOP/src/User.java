import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();

    //construtora
    User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);

    }

    public String getName(){
        return this.name;
    }
    public String getBirthDay(){
        return this.birthDay.toString();
    }

    public String borrowedBooks(){
        return this.books.toString();
    }
    
    public void borrow(Book book) {
        this.books.add(book);
    }

    public int age(){

        //this. faz com que o objeto atual seja 
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }
}
