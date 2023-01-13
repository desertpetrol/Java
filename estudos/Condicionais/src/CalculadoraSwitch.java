import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double num1 = Double.parseDouble(sc.nextLine());

    System.out.print("Digite o segundo número: ");
    double num2 = Double.parseDouble(sc.nextLine());

    System.out.println("Escolha uma operaçao para fazer \nsoma: + \nMultiplicacao: *\nsubtracao: - \ndivisao: /");
    String escolha = sc.nextLine();

    double result = 0;

    switch (escolha) { 
        case "+":
            result = num1 + num2; 
            System.out.printf("%f + %f = %f", num1, num2, result);
            break;

        case "*":
            result = num1 * num2; 
            System.out.printf("%f * %f = %f", num1, num2, result);
            break;

        case "-":
            result = num1 - num2; 
            System.out.printf("%f - %f = %f", num1, num2, result);
            break;

        case "/":
            if(num2 == 0) {
                System.out.println("Impossivel dividir por 0");
            } else{
                result = num1 / num2; 
                System.out.printf("%f / %f = %f", num1, num2, result);
            }
            break;

        default:
            System.out.println("Operador invalido");
            break;
    }

    
        sc.close();







    }

}
