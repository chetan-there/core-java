package com.ct.nestedclass;

record Student(String name, int marks) {
    class Grade {
        void evaluate() {
            if (marks > 80)
                System.out.println(name + " passed with distinction");
            else
                System.out.println(name + " needs improvement");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student("Alice", 90);
        Student.Grade grade = s.new Grade();
        grade.evaluate();
    }
}
