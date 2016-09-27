/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 3 - Course Grades
 * Driver: CourseGradesDemo.java
 *
 * Purpose: Course Grades Simulator.
 * Objective: Be able to use inheritance, polymorphism, and interface.
 */

public class PassFailExam extends PassFailActivity {
    private int numQuestions;  // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed;     // Number of questions missed
    
    public PassFailExam(int questions, int missed, double minPassing) {
        // Call the superclass constructor.
        super(minPassing);
        
        // Declare a local variable for the score.
        double numericScore;
        
        // Set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;
        
        // Calculate the points for each question and
        // the numeric score for this exam.
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        
        // Call the superclass's setScore method to
        // set the numeric score.
        setScore(numericScore);
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
}