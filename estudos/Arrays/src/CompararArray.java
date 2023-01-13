import java.util.Arrays;

public class CompararArray {
    public static void main(String[] args) {
        int numeros[] = {1 ,2 ,3 ,4 , 5};

        int copiaN[] = Arrays.copyOf(numeros, numeros.length);

        System.out.println(numeros == copiaN); //false
        System.out.println(Arrays.equals(numeros, copiaN)); //true

    }
}
