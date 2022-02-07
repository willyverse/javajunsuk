package oop1;

public class Student {

    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;

    Student() {}

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    String info() {
        int sum = kor + eng + math;
        float avg = (int) (sum / 3f * 10 + 0.5f) / 10f;
        return name
                + ", "+ ban
                + ", "+ no
                + ", "+ kor
                + ", "+ eng
                + ", "+ math
                + ", "+ getTotal()
                + ", "+ getAverage();
    }
}

