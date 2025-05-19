import java.util.HashMap;
import java.util.Map;

class HashMapEg {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>(3);
        // add
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

        // remove
        hashMap.remove("John");

        // update
        hashMap.put("John", 50);

        // check isEmpty
        System.out.println(hashMap.isEmpty());

        // get size
        System.out.println(hashMap.size());

        // get all values
        System.out.println(hashMap.values());

        // traversing
        for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        }

    }
}