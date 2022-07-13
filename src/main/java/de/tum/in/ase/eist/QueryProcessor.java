package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Bamboo's App";
        } else if (query.contains("plus")) {
            //what is x plus y
            String s1=query.split("plus")[0];
            String s2=query.split("plus")[1];
            int x= Integer.parseInt(s1.split(" ")[s1.split(" ").length -1]);
            System.out.println(s1.split(" ")[s1.split(" ").length -1]+"_");
            System.out.println(s2+"_");
            int y= Integer.parseInt(s2.replaceAll(" ", ""));

            return x+y+"";
        }
        else if (query.contains("largest")){
            String[] a = query.split(", ");
            List<Integer> b = new ArrayList<>();
            b.add(Integer.valueOf(a[0].split(": ")[1]));
            String[] c =Arrays.copyOfRange(a, 1, a.length);
            for (String s : c){
            b.add(Integer.valueOf(s));
            }
            Collections.sort(b);
            return String.valueOf(b.get(b.size()-1));
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
