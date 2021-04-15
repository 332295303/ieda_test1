package Anonymitynewuser;

import AnonymityClass.Anonymity;

//测试类
public class Demo {
    public static void main(String[] args) {
        Outer ot=new Outer();
        ot.jump(new Inter() {
            @Override
            public void show() {
                System.out.println(" 猫调高了");
            }
        });

         }
    }

