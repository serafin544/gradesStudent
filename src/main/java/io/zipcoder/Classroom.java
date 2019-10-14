package io.zipcoder;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;

public class Classroom {

    Student[] students;
    public Classroom(int maxNumberOfStudents){

    }
    public Classroom(Student[] students){

    }
    public Classroom()
    {
        Student[] students = new Student[30];

    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(){
        double tmp = 0;
        int totalStuds = students.length;
        for(int i = 0 ; i < totalStuds; i++){
            tmp += students[i].getTotalExamScore();
        }
        return tmp;
    }

    public void addStudent(Student student){
        for(int i = 0; i < students.length; i++){
            if(students[i] == null) {
                students[i] = student;
            }
        }
    }
    public void removeStudent(String firstName, String lastName){
        for(int i = 0; i < students.length; i++){
            if(students[i].firstName == firstName && students[i].lastName == lastName){
                students[i] = new Student(null,null,null);
                
            }
        }
    }


}
