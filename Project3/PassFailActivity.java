/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 3 - Course Grades
 * Driver: CourseGradesDemo.java
 *
 * Purpose: Course Grades Simulator.
 * Objective: Be able to use inheritance, polymorphism, and interface.
 */

public class PassFailActivity extends GradedActivity {
    private double minPassingScore; // Minimum passing score
    
    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }
    
    public char getGrade() {
        char letterGrade;
        
        if (super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';
        
        return letterGrade;
    }
}