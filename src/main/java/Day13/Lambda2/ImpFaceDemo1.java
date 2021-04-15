package Day13.Lambda2;

import Day13.Lambda1.FaceDemo;

public class ImpFaceDemo1 implements FaceDemo1 {

    @Override
    public void eat(String s) {
        System.out.println(s);
    }
}
