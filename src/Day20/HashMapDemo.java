package Day20;

import javax.xml.stream.events.EntityReference;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){

//        declaration
//        HashMap map = new HashMap();
//        Map mymap = new HashMap();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();


//        Adding pairs  -> put method
        hm.put(101,"John");
        hm.put(101,"David");
        hm.put(105,"Anusha");
        hm.put(106,"Arun");

        System.out.println(hm);  //{101=David, 105=Anusha, 106=Arun}

//        size of a HashMap
        System.out.println("Size of hashmap:"+hm.size());

        //remove pair
        hm.remove(105);  //105 is the key of the pair
        System.out.println("After removing : "+hm);

//        access value of the key
        System.out.println(hm.get(101));  //101 is the key

//        get all the keys from hashmap
        System.out.println(hm.keySet()); //[101, 106]
        System.out.println(hm.values()); //[David, Arun]
        System.out.println(hm.entrySet()); //[101=David, 106=Arun]

//        Reading data from hashmap
//    from for..each
        for(int k:hm.keySet()){
            System.out.println(k+"      "+hm.get(k));
        }

//        using iterator
        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
        while (it.hasNext()){
//            it.next();
            Map.Entry<Integer,String > entry = it.next();
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }

//        clear hashmap
        hm.clear();
        System.out.println(hm.isEmpty());
    }



}
