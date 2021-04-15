package Day9.Student;

import java.util.Comparator;

public class Student {
    private String name;
    private int math;
    private int english;
    private int language;

    public Student(String name, int math, int english, int language) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.language = language;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }
    public int getNum(){
        return this.getEnglish()+this.getLanguage()+this.getMath();
    }



}
