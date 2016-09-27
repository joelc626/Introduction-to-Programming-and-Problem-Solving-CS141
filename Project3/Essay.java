/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 3 - Course Grades
 * Driver: CourseGradesDemo.java
 *
 * Purpose: Course Grades Simulator.
 * Objective: Be able to use inheritance, polymorphism, and interface.
 */

public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;
    
    public void setScore(double gr, double sp, double len, double con) {
        grammar = gr;
        spelling = sp;
        correctLength = len;
        content = con;
        
        super.setScore(grammar + spelling + correctLength + content);
    }
    
    public void setGrammer(double g) {
        grammar = g;
    }
    
    public void setSpelling(double s) {
        spelling = s;
    }
    
    public void setCorrectLength(double c) {
        correctLength = c;
    }
    
    public void setContent(double c) {
        content = c;
    }
    
    public double getGrammer() {
        return grammar;
    }
    
    public double getSpelling() {
        return spelling;
    }
    
    public double getCorrectLength() {
        return correctLength;
    }
    
    public double getScore() {
        return grammar + spelling + correctLength + content;
    }
}