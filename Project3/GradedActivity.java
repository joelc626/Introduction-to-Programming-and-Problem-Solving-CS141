/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 3 - Course Grades
 * Driver: CourseGradesDemo.java
 *
 * Purpose: Course Grades Simulator.
 * Objective: Be able to use inheritance, polymorphism, and interface.
 */

public class GradedActivity {
    private double score;  // Numeric score
    
    public void setScore(double s) {
        score = s;
    }
    
    public double getScore() {
        return score;
    }
    
    public char getGrade() {
        char letterGrade;
        
        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        
        return letterGrade;
    }
}