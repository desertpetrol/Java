public class While {
    public static void main(String[] args) {
        int num = 5;
        int mult = 1;
        int result = 0;

        //do {
        //    System.out.printf("%d * %d = %d %n",num , mult, result);
        //   result = num * mult;
        //    mult++;
        //} while (mult <= 10);


        while (mult <= 10) {
            System.out.printf("%d * %d = %d %n",num , mult, result);
            result = num * mult;
            mult++;
        }
    }
}