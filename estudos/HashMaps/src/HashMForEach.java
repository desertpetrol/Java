import java.util.HashMap;

public class HashMForEach {
    public static void main(String[] args) throws Exception {

        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 70);
        examScores.put("English", 90);
        examScores.put("Computing", 87);

        //regex that validates an email

        
        //examScores.forEach((subject, score) -> { System.out.println(subject + " - " + score); });

        examScores.forEach((subject, score) -> { examScores.replace(subject, score - 10); }
         );

         System.out.println(examScores.toString());


    }
}