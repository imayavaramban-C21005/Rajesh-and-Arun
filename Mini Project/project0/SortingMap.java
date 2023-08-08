package project0;

import java.util.*;

public class SortingMap {

    HashMap<Integer,Float> temp = new HashMap<>();
    LinkedHashMap<Integer, Float> map = new LinkedHashMap<>();
    public void sortmap(){
        // array to map
       for (Student item: StudentList.list){
           temp.put(item.getRegisterNumber(), item.getCutoff());
       }
       // map to list
       LinkedList<Map.Entry<Integer,Float>> helpingList =
               new LinkedList<Map.Entry<Integer, Float>>(temp.entrySet());
       // sorting List
       Collections.sort(helpingList, new Comparator<Map.Entry<Integer, Float>>() {
           @Override
           public int compare(Map.Entry<Integer, Float> o1, Map.Entry<Integer, Float> o2) {
               return (o2.getValue().compareTo(o1.getValue()));
           }
       });
       // sorted List to map
        for (Map.Entry<Integer, Float> item: helpingList){
            map.put(item.getKey(),item.getValue());
        }

        // printing in sorted way
        for (Map.Entry<Integer, Float> item: map.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
