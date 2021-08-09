package Task_21;

import java.util.ArrayList;
import java.util.Collections;

public class hw_20 {

    public ArrayList<String> abc(String ... s){
        ArrayList<String> al = new ArrayList<>();
        for(String s1 : s){
            if(!al.contains(s1)){
                al.add(s1);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        hw_20 l20  = new hw_20();
        l20.abc("privet", "ok", "poka", "kak dela?", "ok", "hello", "ok");
    }
}
