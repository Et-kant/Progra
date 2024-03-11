package Ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exercise_14 {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(12);
        list1.add(324);
        list1.add(12);
        list1.add(341);
        list1.add(60);

        System.out.println("The original list is: " + list1);

        Set<Integer> listNodoubles = new HashSet<>(list1);
        list1.clear();
        list1.addAll(listNodoubles);

        System.out.println("List with no similar numbers: " + listNodoubles);


    }

}
