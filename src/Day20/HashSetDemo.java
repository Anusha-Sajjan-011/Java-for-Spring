package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args){
//        declaration

        HashSet myset = new HashSet(); //we can store all heterogenous data in this
//        Set myset = new HashSet();
//        HashSet <String>myset = new HashSet<String>();

//        adding elemnts in to hashset
        myset.add(100);
        myset.add(100);
        myset.add(null);
        myset.add(null);
        myset.add("welcome");
        myset.add(false);
        myset.add("A");

//        o/p  -> [null, A, 100, false, welcome]

//        print hashset
        System.out.println(myset);


//        size of hashset
        System.out.println("Size of hashset:" +myset.size());

//        removing element
        myset.remove(100);
        System.out.println("After removing"+myset);

//        Inserting element  -> Not possible -> beacause elements are storing in random order so where actually we can insert new one?? so its not possible

//        Accessing Specific element  -> here there is no indexing algorithm --> so we cant access specific element
//        alternative method for  Accessing Specific element is available
//         Conver hashset --> arraylis
        ArrayList al = new ArrayList(myset);
        System.out.println(al);
        System.out.println(al.get(2));


//        Read all the elemts using for..each loop -> throgh the normal for loop we can read because in hashset there is no index
        for (Object x: myset){
            System.out.println(x);
        }

//       Read though  iteration
        Iterator <Object> it = myset.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

//        clearing all the elemnts in hashset
        myset.clear();
        System.out.println(myset.isEmpty());
    }

}
