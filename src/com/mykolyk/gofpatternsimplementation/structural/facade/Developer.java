package com.mykolyk.gofpatternsimplementation.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if(bugTracker.isActiveSprint()) {
            System.out.println("Developer works!");
        } else {
            System.out.println("Developer chills!");
        }
    }
}
