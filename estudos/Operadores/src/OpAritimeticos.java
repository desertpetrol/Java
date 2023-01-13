public class OpAritimeticos {
    public static void main(String[] args) throws Exception {
        double numero1 = 10;
        double numero2 = 3;

        //addição 
        System.out.println("Adicao " + (numero1+numero2) +" | "+ (numero1 += 3));
        //subtração
        System.out.println("Subtracao " + (numero1-numero2) +" | "+ (numero1 -= 3));
        //multiplicação
        System.out.println("multiplicacao " + (numero1*numero2) +" | "+ (numero1 *= 3));
        //divisão
        System.out.println("Divisao " + (numero1/numero2) +" | "+ (numero1 /= 3));
        //sobra (Modulo)
        System.out.println("Mod " + (numero1%numero2) +" | "+ (numero1 %= 3));
        
        //Operadores aritiméticos seguidos de = fazem ele atribuir o valor do resultado para a mesma variável
    }
}
