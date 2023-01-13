public class Metodos {
    public static void main(String[] args) {
        String name = "Pedro Emanuel";
        String none = " ";

        System.out.println(name.length());
        System.out.println(none.isEmpty()); //False pois o espaço é um character
        System.out.println(name.toUpperCase()); // Maiúsculo 
        System.out.println(name.toLowerCase()); // Minúsculo 

        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1.equalsIgnoreCase(string2)); //comparar ignorando o Case

        // Alterar string (Não modifica o valor original)
        String newString = string1.replace("abc", "Heyooo!");
        System.out.println("Original: "+ string1 + "\nNova: " + newString);



    }
}
