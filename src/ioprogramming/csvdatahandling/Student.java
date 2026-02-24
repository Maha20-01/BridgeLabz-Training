package ioprogramming.csvdatahandling;

public class Student {
    public int id;
    public String name;
    public int age;
    public int marks;

    public Student() {}   // required for JSON

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
