package student;

import gradebook.Assignment;

import java.util.ArrayList;

public class ActiveStudent {
    private String studentId;
    private String tinderId;
    private String name;
    private ArrayList <Assignment> assignments;

    public ActiveStudent(String studentId, String tinderId, String name){
        this.studentId=studentId;
        this.tinderId=tinderId;
        this.name=name;
    assignments = new ArrayList<Assignment>();

    }
    public void addAssignment(Assignment assignment){
        assignments.add(assignment);
    }

}
