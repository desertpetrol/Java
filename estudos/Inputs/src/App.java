import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String message = "The sky is blue";
        // System.out.println("Vlw FreeCode");
         Scanner scanner = new Scanner(System.in);

        System.out.print("Qual e seu nome? ");         //Print sna mesma linha
        String name = scanner.nextLine();

        System.out.printf("Oi %s... Como vai? Qual a sua idade? ", name);         //Print formatado
        //Ao usar nextInt()/nextFloat()/etc.. junto de nextLine o nextLine recebe tanto o texto que eu digitei quanto o <enter> armazenado no buffer pelo nextInt anterior. Uma solução é apenas usar nextLine e converter os valores do scanner.
        //int age = scanner.nextInt();   
        int age = Integer.parseInt(scanner.nextLine());  

        System.out.printf("Legal, %d anos e uma boa idade pra comecar a programar. Qual sua lingua favorita? ", age);
        String lang = scanner.nextLine();
        
        System.out.printf("%s e uma linguagem maneira ", lang);

        scanner.close(); //Não fechar o Scanner faz ele ocupar espaço desnecessário na memória.
    }
}
