import java.util.Arrays;

public class DeclararArray {
    public static void main(String[] args) throws Exception {
        //char vogais[] = new char[5];
        //a e i o u
        //vogais[0] = 'a'; vogais[1] = 'e'; vogais[2] = 'i'; vogais[3] = 'o'; vogais[4] = 'u';

        char vogais[] = { 'a', 'e', '4' , 'i', 'o', 'u', '7', '2'};

        System.out.println(vogais.length);

        Arrays.sort(vogais);

        int startingIndex = 1;
        int endingIndex = 4;
        char key = 'o';

        int itemIndex = Arrays.binarySearch(vogais, startingIndex, endingIndex, key);

        System.out.println(Arrays.toString(vogais));
        System.out.println(itemIndex);


    }
}
