package Ejercicios;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise_16 {

    public static void main(String[] args){
        HashMap<String, Integer> Container = new HashMap<>();

        Container.put("A", 10);
        Container.put("B", 5);
        Container.put("C", 15);
        Container.put("D", 3);
        Container.put("E", 20);

        int Limit = 10;
        System.out.println("Default HashMap: " + Container);

        Iterator<Map.Entry<String, Integer>> iterator = Container.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < Limit){
                iterator.remove();
            }
        }

        System.out.println("HashMap when the keys are removed: " +  Container);

    }
}
