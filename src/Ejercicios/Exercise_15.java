package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise_15 {

    public static void main(String[] args){
        List<Integer> ListOddNumbers = new ArrayList<Integer>();

        ListOddNumbers.add(1);
        ListOddNumbers.add(2);
        ListOddNumbers.add(3);
        ListOddNumbers.add(4);
        ListOddNumbers.add(5);

        System.out.println("Original List: " + ListOddNumbers);

        Iterator<Integer> iterator = ListOddNumbers.iterator();

        while(iterator.hasNext()){
            int element = iterator.next();
            if (element % 2 != 0){
                iterator.remove();
            }
        }

        System.out.println("List without odd numbers: " + ListOddNumbers);

    }
}
