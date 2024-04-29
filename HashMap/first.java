package HashMap;

import java.util.*;

public class first {
    public static void main(String[] args) {
        
        Map<Integer, String> hs = new HashMap<>();
        hs.put(1,"Banana");
        hs.put(2,"Grapes");
        hs.put(3, "Orange");
        hs.put(4, "Banana");

        System.out.println(hs);
        hs.put(4, "Shimla");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.containsValue("Banana"));
        //System.out.println(hs.containsKey(5));

        for(Map.Entry m: hs.entrySet())
        {
            System.out.println(m.getKey() +" "+ m.getValue());
        }
    }
    
}
