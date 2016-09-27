/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 3 - Course Grades
 * Driver: CourseGradesDemo.java
 *
 * Purpose: Course Grades Simulator.
 * Objective: Be able to use inheritance, polymorphism, and interface.
 */

public class FinalExam extends GradedActivity {
    private int numQuestions;  // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed;     // Questions missed
    
    public FinalExam(int questions, int missed) {
        double numericScore;  // To hold a numeric score
        
        // Set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;
        
        // Calculate the points for each question and
        // the numeric score for this exam.
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        
        // Call the inherited setScore method to
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