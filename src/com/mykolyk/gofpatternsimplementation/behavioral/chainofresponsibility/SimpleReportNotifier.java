package com.mykolyk.gofpatternsimplementation.behavioral.chainofresponsibility;

public class SimpleReportNotifier extends  Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Simple report with massage: " + massage + " notified!");
    }
}
