package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
//        Declaration
        ArrayList mylist = new ArrayList();
//        List mylist = new ArrayList();

//        ArrayList <Integer>mylist = new ArrayList<Integer>();
        //ArrayList <String>mylist = new ArrayList<String>();
//        ArrayList <Employee>mylist = new ArrayList<Employee>();  //have to crete employee class


//        Adding data into arraylist
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);

//        size of arraylost -> method size()
        System.out.println("size of the arraylist " +mylist.size());

        //printing arraylist
        System.out.println("priniting data from arraylist:"+mylist);

//        remove some object or one element
        mylist.remove(5);
        System.out.println("After removing I'm priniting data from arraylist:"+mylist);


//        insertion  --> Insertion and adding are different
//        add-> add(jashj)-> it will ket adding at the end of the list
//        insertion -> with the add method we have to add the index and value both --> mylist.add(6,"anusha")
//        [x,y,z,1,,2] -> add(2,"A") -> [x, y, A, Z, 1, 2]
        mylist.add(5,"Anusha");
        System.out.println("After Inserting I'm priniting data from arraylist:"+mylist);


//        Access specify element from arraylist
        System.out.println("After accesing I'm priniting data from arraylist:"+mylist.get(3));

//        Reading all the elements from arraylist

//        reading through using normal loop
//        for(int i=0; i<= mylist.size()-1; i++){
//            System.out.println(mylist.get(i));
//        }

//        using enhanced for loop -> for each loop
//        for(Object x:mylist){
//            System.out.println(x);
//        }


//        reading through iterator -> iterator  is a cursor
        //hasnext -> is a method check the first element is exist or not and also move to next element if exist
        Iterator it = mylist.iterator();  //we are storing the output in the variable it its type is iterator , if we use the word "new" than its a cration of object
//        System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        checking arraylist is empty or not -> there is a method isEmpty()
        System.out.println("Is arraylist empty:"+ mylist.isEmpty());


//        remove all the elements from arraylist
        ArrayList mylist2 = new ArrayList();
        mylist2.add(100);
        mylist2.add("welcome");

        mylist.removeAll(mylist2);
        System.out.println("After removing mulptiple elements:" + mylist);

//        remove all te elements/clear
        mylist.clear();
        System.out.println("Is arraylist empty:"+ mylist.isEmpty());

    }
}
