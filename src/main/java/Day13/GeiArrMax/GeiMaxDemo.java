package Day13.GeiArrMax;

import java.util.function.Supplier;

public class GeiMaxDemo {
    public static void main(String[] args) {
        int arr[]={1,5,3,4,3,1};
       int maxnb= geiMax(()->{
           int max=arr[0];
           for (int i=1;i<arr.length;i++){
               if (arr[i]>max)
                   max=arr[i];
           }
            return max;
        });
        System.out.println(maxnb);
    }
    private static int geiMax(Supplier<Integer> s){
       return s.get();

    }
}
