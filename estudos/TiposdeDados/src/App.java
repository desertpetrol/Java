public class App {
    public static void main(String[] args) throws Exception {
        // Tipos de Integer
        byte unicoByte = 100; //-128 a 127
        short numeroPequeno = 20000; // -32,768 a 32,767
        int umInterger = 2147483647; //-2147483648 a 2147483647
        Long numeroGrande = 9223372036854775807L; //-9223372036854775808 a 9223372036854775807 
        // O compilador precisa do "L" para considerar um numero como long.

        //Tipos decimais 
        double umDouble = 1.79769313; // 1.7976931348623157 x 10^308, 4.9406564584124654 x 10^-324
        float umFloat = 3.3028F; //	3.40282347 x 1038, 1.40239846 x 10^-45
        //O compilador precisa do "f || F" para considerar o número um float

        //booleans
        boolean finalSemana= true;
        boolean diaDeTrabalho = false;

        //characteres
        char copyright = '\u00a9';
        System.out.println(copyright);


        
    }
}
