public class ForArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int sum = 0;

        //for (type variableName : arrayName) Extrai os valor do array e o coloca em cada iteração do for (for each)
        for(int i : nums) {
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }


}
