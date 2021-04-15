package Day7.Mapstiatics;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StiaticsLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for (int i=0;i<s1.length();i++){
            char key=s1.charAt(i);
            Integer value = hm.get(i);

            if (value!=null){
                System.out.println("我到了");
                value++;

            }
            else
            {
                hm.put(key,1);
            //    System.out.println(value);
                hm.put(key,value);
            }

        }
        StringBuilder sb=new StringBuilder();
        Set<Character> characters = hm.keySet();
        for (Character c:characters){
            Integer value = hm.get(c);
            sb.append(c).append("(").append(value).append(")");
           // System.out.println("key"+c+"  "+"value"+value);
        }
        String sto=sb.toString();
      //  System.out.println(sto);


    }
}
