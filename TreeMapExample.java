//Unlike HashMap. TreeMap stores data in sorted fomat of key

import java.util.*;

public class TreeMapExample {
 
    public static void main (String[] args)
    {
        TreeMap<Integer,String> t = new TreeMap();
        
        t.put(-1, "B");
        t.put(1, "D");
        t.put(0, "C");
        t.put(2, "F");
        t.put(2, "E");
        t.put(-2, "A");
        
        for (int k: t.keySet())
        {
        	System.out.print(k + ", ");
        	System.out.println();
            System.out.print(t.get(k) + ", ");
        }
    }

}
