import java.util.Arrays;
import java.util.Comparator;

public class Student
{
    String fio;
    int course, m1, m2, m3;

    public Student(String fio, int course, int m1, int m2, int m3) {
        this.fio = fio;
        this.course = course;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", course=" + course +
                ", m1=" + m1 +
                ", m2=" + m2 +
                ", m3=" + m3 +
                '}';
    }
}