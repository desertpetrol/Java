public class ForTabuada {
    public static void main(String[] args) {
        
        int produto = 0;
        //Enquanto o multiplicador for <= 10 imprima o multiplicador * multiplicando 10 vezes
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
            for (int multiplicando = 0; multiplicando <= 10; multiplicando++) {
                produto = multiplicador * multiplicando;
                System.out.printf("%d * %d = %d %n",multiplicador ,multiplicando, produto );
            }

        }
            

    }
}
