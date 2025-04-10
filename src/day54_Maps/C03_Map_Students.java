package day54_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C03_Map_Students {
    public static void main(String[] args) {
        //Map ->
        //keys: String, Integer
        //values: String, Integer,Double...
        //values:Array,Class Object,List,Map

        Map<Integer,Student> studentList = new TreeMap<>();

        Student st1 = new Student(5,"süleyman",3.4,"java");
        Student st2 = new Student(3,"Alper",4.0,"cypress");
        Student st3 = new Student(7,"Selda",2.5,"playwright");
        Student st4 = new Student(10,"Irem",1.7,"AWS");
        Student st5 = new Student(4,"Tulay",3.9,"Jenkis");
        Student st6= new Student(6,"Yasemin",2.9,"Gitup");

        //studentList.put(key,value);
        studentList.put(st1.getStudentId(),st1);
        studentList.put(st2.getStudentId(),st2);
        studentList.put(st3.getStudentId(),st3);
        studentList.put(st4.getStudentId(),st4);
        studentList.put(st5.getStudentId(),st5);
        studentList.put(st6.getStudentId(),st6);

        System.out.println("studentList = " + studentList);

        //key kullanarak value cagirmak
        System.out.println("\nstudentList.get(7) = " + studentList.get(7));

        //key kullanarak,object value deki degerleri cagirmak
        System.out.println("studentList.get(7).getName() = " + studentList.get(7).getName());

        //farkli key' e ayni value atamasi
        studentList.put(11,st1);
        System.out.println("studentList = " + studentList);

        //var olan bir key'e farkli bir value atamasi
        //key daha once tanimlandi ise,ayni key'in karsiligi olan value,yeni value ile replace oluyor.update oluyor
        studentList.put(11,st2);
        System.out.println("\nstudentList = " + studentList);


    }
}
class Student{
    private int studentId;
    private String name;
    private double grade;
    private String className;

    public Student(int studentId, String name, double grade, String className) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.className = className;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", className='" + className + '\'' +
                '}';
    }
}