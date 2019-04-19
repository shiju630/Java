import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.HashMap;

class mymainclass{

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(13);
        arr.add(4);
        arr.add(6);
        arr.add(45);
        arr.add(23);
        System.out.println(arr);

        Collections.sort(arr);
        Collections.reverse(arr);
        Collections.shuffle(arr);
        
        for (int i : arr) {
            System.out.println(i);
        }

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"india");
        hm.put(2,"usa");
        hm.put(3,"uk");
        System.out.println(hm);

        System.out.println(hm.get(1));

        for (int i : hm.keySet()) {
            System.out.println(hm.get(i));
        }

    }

}