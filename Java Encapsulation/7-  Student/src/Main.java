/*
7. Write a Java program to create a class called Student with private instance variables student_id,
student_name, and grades. Provide public getter and setter methods to access and modify the student_id
and student_name variables. However, provide a method called addGrade() that allows adding a grade to the
grades variable while performing additional validation.
*/


public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("John");
        student.setStudentId(202321);
        student.addGrade(2.0f);
        student.addGrade(3.0f);
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentId());
        student.getGrades();
    }
}