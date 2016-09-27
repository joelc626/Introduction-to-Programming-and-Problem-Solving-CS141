/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 3 - Course Grades
 * Driver: CourseGradesDemo.java
 *
 * Purpose: Course Grades Simulator.
 * Objective: Be able to use inheritance, polymorphism, and interface.
 */

public class CourseGrades implements Analyzable {
    private GradedActivity grades[];
    private final int NUM_GRADES = 4;
    
    public CourseGrades() {
        grades = new GradedActivity[NUM_GRADES];
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }
    
    public String toString() {
        String str = "Lab Score: " + grades[0].getScore()
        + " \t\tGrade: " + grades[0].getGrade()
        + "\nPass/Fail Exam Score: " + grades[1].getScore()
        + " \tGrade: " + grades[1].getGrade()
        + "\nEssay Score: " + grades[2].getScore()
        + " \t\tGrade: " + grades[2].getGrade()
        + "\nFinal Exam Score: " + grades[3].getScore()
        + " \t\tGrade: " + grades[3].getGrade();
        return str;
    }
    
    public double getAverage() {
        double total = 0.0;
        double avg = 0.0;
        
        for (int i = 0; i < grades.length; i++)
            total += grades[i].getScore();
        avg = total / grades.length;
        
        return avg;
    }
    
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        
        for (int i = 1; i < grades.length; i ++)
            if (grades[i].getScore() >= highest.getScore())
                highest = grades[i];
        
        return highest;
    }
    
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        
        for (int i = 1; i < grades.length; i++)
            if (grades[i].getScore() <= lowest.getScore())
                lowest = grades[i];
        
        return lowest;
    }
}