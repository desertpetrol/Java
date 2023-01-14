import java.util.ArrayList;

public class ArrayLForEach {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("Antes: " + numbers.toString());

        //indexOf retorna o index do valor atual de i e então estamos atualizando o elemento com o novo valor multiplicado.
        numbers.forEach(i -> {
        numbers.set(numbers.indexOf(i), i * 2);
        });

       // numbers.forEach(i -> {
       //     System.out.println(i * 2);
       // });

        System.out.println("Depois: " + numbers.toString());





    }    
}
