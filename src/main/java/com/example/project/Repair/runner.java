package com.example.project.Repair;
import java.util.ArrayList;

public class runner {
    public static void main(String[] args) {
        RepairSchedule schedule = new RepairSchedule(3); 

        // all mechanics free
        ArrayList<Integer> availableMechanics = schedule.availableMechanics();
        
    }
}