package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

        public Student(String firstName, String lastName, ArrayList<Double> testScores){
            this.firstName = firstName;
            this.lastName = lastName;
            this.examScores = testScores;
            
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getNumberOfExamsTaken(){
            return examScores.size();
    }
    public double getTotalExamScore(){

            Double tmp = 0.0;
            for(int i = 0;  i < examScores.size(); i++){
                tmp += examScores.get(i);
            }
            return tmp;
    }
    public String getExamScores(){
            String tmp= "Exam Scores:\t +\n\t\t";
        for(int i = 0; i < this.examScores.size(); i++){
            tmp += " Exam " + i + "-> " + this.examScores.get(i);
        }
        return tmp;
    }
    public void setExamScores(int examNumber, double newScore){
            this.examScores.set(examNumber,newScore);
    }

    public double getAverageExamScore(){
            double tmp = 0.0;
            double size = this.examScores.size();
            for(int i = 0 ; i < size; i++){
                tmp += this.examScores.get(i);
            }
            return tmp/size;
    }

    @Override
    public String toString() {
        return "Student Name:  " + firstName + " "  + lastName  +
                "\n > Average Score: " + getAverageExamScore()
                +"\n >" + getExamScores();
    }
}
