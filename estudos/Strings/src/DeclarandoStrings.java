public class DeclarandoStrings {
    public static void main(String[] args) throws Exception {

        //Declaração literal da String 
        String literalString1 ="abc";
        String literalString2 = "abc";

        //Declarando string como objeto
        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);
        
        //Em strings literais o JVM procura se já existe uma string com o valor de xyz, se sim então a variável vai ser uma referência a um valor que já existe. Declarar a String como objeto força o JVM a alocar outro espaço na memória para referência idependente se são o mesmo valor. 

        // String nome = new String("Pedro Emanuel")
        


    }
}
