package Day7.Poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//发牌洗牌 看牌
public class Poker1Demo {
    public static void main(String[] args) {
        //创建存储所有牌得 集合arr
        ArrayList<String> arr=new ArrayList<String>();
        String [] color={"♣","♦","♥","♠"};
        String [] number={"2","3","4","5","6","7","8","9","10","J","K","Q","A"};
        ArrayList<String>player1=new ArrayList<String>();
        ArrayList<String>player2=new ArrayList<String>();
        ArrayList<String>player3=new ArrayList<String>();
        ArrayList<String>tmPoker=new ArrayList<String>();
       /* for (int i=0;i<color.length;i++){
            for (int j=0;j<number.length;j++){
                arr.add(color[i]+number[j]);
            }
        }*/
        arr.add("大王");
        arr.add("小王");
        //地址 携程number勒 我说勒
        for (String c:color){
            for (String n:number){
                arr.add(c+n);

            }
        }
        /* for (String c : color) {
            for (String n : number) {
                arr.add(c + n);
            }
        }*/


        Collections.shuffle(arr);
        for (int i=0;i<arr.size();i++){
            if(i>=arr.size()-3){
                tmPoker.add(arr.get(i));
            }
            else if (i%3==0){
                player1.add(arr.get(i));
            }
            else if (i%3==1){
                player2.add(arr.get(i));
            }
            else if (i%3==2){
                player3.add(arr.get(i));
            }

        }
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
        lookPoker("底牌",tmPoker);



    }
    public  static void lookPoker(String name,ArrayList<String>arrayList){
        System.out.println(name+"的牌是");
        for (String s:arrayList){
            System.out.print("\t"+s);
        }
        System.out.println();
    }
}
