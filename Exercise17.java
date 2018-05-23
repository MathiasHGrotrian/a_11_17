package Chapter11;

import java.util.HashMap;
import java.util.Map;

public class Exercise17
{
    /*
        Write a method called subMap that accepts two maps from strings to
        strings as its parameters and returns true if every key in the first
         map is also contained in the second map and maps to the same value in
          the second map. For example, {Smith=949–0504, Marty=206–9024} is a
          submap of {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567}.
          The empty map is a submap of every map.
     */

    public static void main(String[] args)
    {
        Map<String,String> map1 = new HashMap<>();
        map1.put("Smith","949-0504");
        map1.put("Marty","206-9024");
        map1.put("Jake","101-202");

        Map<String,String> map2 = new HashMap<>();
        map2.put("Marty","206-9024");
        map2.put("Hawking","123-4567");
        map2.put("Smith","949-0504");
        map2.put("Newton","123-4567");

        System.out.println(subMap(map1,map2));
    }

    public static boolean subMap(Map<String, String> map1, Map<String, String> map2)
    {
        boolean subMap = true;

        if (map1.isEmpty() == true)
        {
            return subMap;
        }

        for (Map.Entry<String, String> m1: map1.entrySet())
        {
            if(map2.containsKey(m1.getKey()) != true || map2.containsValue(m1.getValue()) != true)
            {
                subMap  = false;
                return subMap;
            }
        }

        return subMap;
    }
}
