import java.util.ArrayList;
import java.util.Comparator;

public class ArrayL {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= 5; i++) {
            numbers.add(i);
        }

        //ArrayList original { 1, 2, 3, 4, 5 }  

        //Coleta o valor do array no index escolhido
        System.out.println(numbers.get(0));
        
        //Remove o valor do array no index escolhido
        numbers.remove(0);
        numbers.remove(Integer.valueOf(5));

        //remove todos os valores do array
        //numbers.clear();
        
        //Troca valor no index escolhido
        //Array list são tipos de referencia então precisam de métodos para terem seus valores corretamente alterados
        numbers.set(2, Integer.valueOf(0));

        //Ordena baseado em um comparador
        numbers.sort(Comparator.naturalOrder());
                            //.reverse order()

        System.out.println(numbers.toString());
        
        System.out.println("Existe o numero 1 na ArrayList? " + numbers.contains(Integer.valueOf(1)));

        System.out.println("A ArrayList esta vazia? " + numbers.isEmpty());

        System.out.println(numbers.size());




    }
}
