import java.util.HashMap;

public class AddToCollecyion {

    public static void addMethod(HashMap<String, Integer> map, String string, Integer integer) throws RuntimeException {
        if (map.containsKey(string) && map.get(string).equals(integer)) {
            throw new RuntimeException("Такой ключ: " + string + " и значение: " + integer + " уже есть в массиве");
        } else if (map.containsValue(integer)) {
            map.replace(string, integer);
        } else {
            map.put(string, integer);
        }
    }
}
