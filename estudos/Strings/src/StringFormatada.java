public class StringFormatada {
    public static void main(String[] args) {

        String nome = "Pedro Emanuel"; //%s
        String pais = "Brasil";
        int idade = 21; //%d
        double agua = 0.70; //%f
        char porcentagem = '%'; //%c
        boolean estudando = true; //%b

        //System.out.println("Hello world! Meu nome e " + nome + ". Eu sou do " + pais + " e tenho " + idade );

        String stringFormatada = String.format("My name is %s. I am from %s and am %d years old e sou composto de %f%c agua e e %b que estou estudando Java.", nome, pais, idade, agua, porcentagem, estudando);

        System.out.println(stringFormatada);
    }
}
