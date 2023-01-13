public class OpIncremento {
    public static void main(String[] args) {
        int pontos = 0;

        //Incrementa o valor 
        System.out.println("Incrementando de 0: " + (++pontos));

        //reduz o valor 
        System.out.println("Reduzindo do incremento anterior: " + (--pontos));
        pontos = 0;

        //O java normalmente compila o código da esquerda pra direita então o operador de incrementação é "lido" depois da variável
        System.out.println("Incrementando de 0: " + (pontos++));
        System.out.println("Retornando o valor do incremento anterior: " + (pontos));




    }

}