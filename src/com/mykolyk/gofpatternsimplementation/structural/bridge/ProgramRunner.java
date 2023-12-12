package com.mykolyk.gofpatternsimplementation.structural.bridge;

public class ProgramRunner {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program: programs) {
            program.developProgram();
        }
    }
}
