import java.util.*;

public class CollectionsSample {
    static void main() {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(new String("A"), 1);
        hashMap.put(new String("B"), 2);
        hashMap.put(new String("C"), 3);
        hashMap.put(new String("D"), 4);

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while(iterator.hasNext()) {

            Map.Entry<String, Integer> next = iterator.next();
            System.out.print( next.getKey());
            System.out.println( next.getValue());


        }


        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(1);

        System.out.println(list.size());
        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.remove(0));

        System.out.println(list);
    }
}
