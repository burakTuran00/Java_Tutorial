import java.util.HashMap;
import java.util.Map;

public class HashMapMain
{
    // to store key and value, each key has a value. <key,value>
    // a key just can be once. But can be more value. key must be different.
    public static void main(String[] args)
    {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(0,"python");
        hashMap.put(20,"java");
        hashMap.put(50,"php");
        hashMap.put(21, "php");

        hashMap.put(50,"c#");  // print c# instead of php. remove php

        System.out.println(hashMap);

        System.out.println(hashMap.get(20));  // key
        System.out.println(hashMap.get(100)); // null , not error!

        int size = hashMap.size();
        System.out.println(size);

        for(Map.Entry<Integer,String> e : hashMap.entrySet())
        {
            System.out.println(e.getKey()+ " - "+  e.getValue());
        }
    }
}
