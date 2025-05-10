/*
7. Write a Java program to create a class called Student with private instance variables student_id,
student_name, and grades. Provide public getter and setter methods to access and modify the student_id
and student_name variables. However, provide a method called addGrade() that allows adding a grade to the
grades variable while performing additional validation.
*/


import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    ArrayList<Float> grades = new ArrayList<>();


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }


    public void addGrade(float grade) {
        if(grade >= 1.0 && grade <= 4.0){
            grades.add(grade);
        }
        else
            System.out.println("this is not a valid grade");
    }
    public void getGrades(){
        System.out.println(grades);
    }


}
