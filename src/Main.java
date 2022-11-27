import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> collection =new  HashMap<>();
        AddToCollecyion.AddMethod((HashMap<String, Integer>) collection,"a",1);
        AddToCollecyion.AddMethod((HashMap<String, Integer>) collection,"b",2);
        AddToCollecyion.AddMethod((HashMap<String, Integer>) collection,"a",3);
        System.out.println(collection);

    }
}