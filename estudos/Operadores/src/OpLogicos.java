public class OpLogicos {
    public static void main(String[] args) {
        
        // se x E y, verdadeiro
        int idade = 25;

        System.out.println(idade >= 18 && idade <= 40);
        
        // se x OU y, verdadeiro
        boolean eEstudante = false;
        boolean eMembroBiblioteca = false;
  
        System.out.println("Pode pegar livro? " + (eEstudante || eMembroBiblioteca));

        //x não é
        System.out.println("Pode pegar livro? " + (!eEstudante || eMembroBiblioteca));


    

    }
}
