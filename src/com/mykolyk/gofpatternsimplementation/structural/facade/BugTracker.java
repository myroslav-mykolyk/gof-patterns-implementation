package com.mykolyk.gofpatternsimplementation.structural.facade;

public class BugTracker {
    public boolean activeSprint;
    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint started!");
        activeSprint = true;
    }

    public void endSprint() {
        System.out.println("Sprint ended!");
        activeSprint = false;
    }
}
