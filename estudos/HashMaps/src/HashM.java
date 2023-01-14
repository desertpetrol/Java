import java.util.HashMap;

public class HashM {
    public static void main(String[] args) throws Exception {

        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 70);
        examScores.put("English", 90);
        examScores.put("Computing", 87);

        //se o valor não existe ele o cria, caso contrário é pulado
        examScores.putIfAbsent("PE", 60);

        //trocoa os valores da chave
        examScores.replace("Math", 75);

        System.out.println(examScores.get("English"));

        examScores.remove("Computing");

        examScores.containsKey("English");
  

        System.out.println(examScores.toString());
        System.out.println("Size: " + examScores.size());
        System.out.println("Empty?: " + examScores.isEmpty());
        System.out.println("Contem o valor 100? " + examScores.containsValue(100));  


      




    }
}

//2 verdades e 1 mentira: 

//1- Já vi duas pessoas transando no fundamental

//2- 

//3- 