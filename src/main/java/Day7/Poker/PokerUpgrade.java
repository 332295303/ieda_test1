package Day7.Poker;

import java.util.*;

public class PokerUpgrade {
    public static void main(String[] args) {
        // 意识就是 用hashmap 集合 存储 键和 索引值 在用arrlist里面的索引来
        //引用hashmap里面的值  这样的话
        //再把 Arrlist里面的 index  存储进去这样的话就可以 完美解决了
        //
        HashMap<Integer,String>mp=new HashMap<Integer, String>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        String [] colors={"♣","♦","♥","♠"};
        String [] numbers={"2","3","4","5","6","7","8","9","10","J","K","Q","A"};
        Integer index=0;
        //如果这里  先按花色排序那么 arr里面的index  就会按照进行排序 大小就不能确定
        //所以 一定要按照主官的条件 排序
        for (String number:numbers){
        for (String color:colors){

                mp.put(index,color+number);
                arr.add(index);
                index++;
            }
        }
        mp.put(index,"大王");
        arr.add(index);
        index++;
        mp.put(index,"小王");
        arr.add(index);

        Collections.shuffle(arr);
        TreeSet<Integer> player1=new TreeSet<Integer>();
        TreeSet<Integer> player2=new TreeSet<Integer>();
        TreeSet<Integer>player3=new TreeSet<Integer>();
        TreeSet<Integer> tmPoker=new TreeSet<Integer>();
        for (int i=0;i<arr.size();i++){
            int x = arr.get(i);
            if(i>=arr.size()-3){
                tmPoker.add(x);
            }
            else if (i%3==0){
                player1.add(x);
            }
            else if (i%3==1){
                player2.add(x);
            }
            else if (i%3==2){
                player3.add(x);
            }

        }
        lookpoker("1",player1,mp);


    }
    public static  void  lookpoker(String name, TreeSet<Integer> arrayList, HashMap<Integer,String> hashMap){
        System.out.println(name+"牌是");
        for (Integer it:arrayList){
            String s = hashMap.get(it);
            //获得的值
            System.out.print(" "+s);
        }
    }
}
