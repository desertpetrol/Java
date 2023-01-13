import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        int numeros[] = {1 ,2 ,3 ,4 , 5};

        //int copiaN[] = numeros;
        //Arrays são tipos de dados de referência então ele não cria uma nóvia cópia dos valores, apenas  cria uma nova variável que aponta para o valor na memória.

        int copiaN[] = Arrays.copyOf(numeros, numeros.length);

        int startingIndex = 1;
        int endingIndex = 6;

        //copia dentro da range estabelecida.
        int copiaN2[] = Arrays.copyOfRange(numeros, startingIndex, endingIndex);
    
        //Preenche TODO o array com um valor
        Arrays.fill(numeros, 0);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaN));
        System.out.println(Arrays.toString(copiaN2));






    }
}
