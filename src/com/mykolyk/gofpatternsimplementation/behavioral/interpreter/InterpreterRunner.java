package com.mykolyk.gofpatternsimplementation.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJavaDeveloper = getJavaExpression();
        Expression isJavaEeDeveloper = getJavaEeExpression();

        System.out.println("Java core developer know Java: " + isJavaDeveloper.interpret("Java"));
        System.out.println("Java core developer know Java core: " + isJavaDeveloper.interpret("Java core"));
        System.out.println("Java core developer know Java EE: " + isJavaDeveloper.interpret("Java EE"));
        System.out.println("Java EE developer know Java: " + isJavaEeDeveloper.interpret("Java"));
        System.out.println("Java EE developer know Java core: " + isJavaEeDeveloper.interpret("Java Core"));
        System.out.println("Java EE developer know Java EE: " + isJavaEeDeveloper.interpret("Java EE"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEeExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaEe = new TerminalExpression("Java EE");
        return new AndExpression(java, javaEe);
    }
}
