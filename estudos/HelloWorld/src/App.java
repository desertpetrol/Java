import java.time.Year;

public class App {
    static int primeiroOla; //Quando o Olá mundo foi criado
    public static void main(String[] args) throws Exception {
        int idade;
        int dataAtual = Year.now().getValue(); 
        primeiroOla = 1978;
        idade = dataAtual - primeiroOla;

        System.out.println("Ola mundo, eu tenho "+idade+" Anos");
    }
}

