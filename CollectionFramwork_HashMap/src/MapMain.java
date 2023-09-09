import java.util.*;

public class MapMain
{
    public static void toPrintMap(Map<Integer,String> map)
    {
        map.put(1,"java");
        map.put(2,"python");
        map.put(8,"c++");
        map.put(10,"php");
        map.put(7,"c#");
        map.put(5,"kotlin");

        for(Map.Entry<Integer,String> e : map.entrySet())
        {
            System.out.println(e.getKey() + "-"+ e.getValue());
        }

        for(Integer key : map.keySet())
        {
            System.out.println(key + "-" + map.get(key));
        }

        Collection<String> values = map.values();
        for(String value : values)
        {
            System.out.println(value);
        }
    }
    public static void main(String[] args)
    {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();

        toPrintMap(hashMap);
        System.out.println();

        toPrintMap(linkedHashMap);
        System.out.println();

        toPrintMap(treeMap);
        System.out.println();
    }
}
