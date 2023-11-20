package com.mykolyk.gofpatternsimplementation.creational.singleton;

public class Program {
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
        System.out.println(programLogger.toString());
        programLogger.addLogInfo("First log");
        programLogger.addLogInfo("Second log");
        programLogger.addLogInfo("Third log");
        programLogger.showLogFile();

        ProgramLogger programLogger2 = ProgramLogger.getProgramLogger();
        System.out.println(programLogger2.toString());
        programLogger2.showLogFile();
    }
}
