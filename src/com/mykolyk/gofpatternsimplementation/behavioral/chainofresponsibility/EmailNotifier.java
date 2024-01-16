package com.mykolyk.gofpatternsimplementation.behavioral.chainofresponsibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Email report with massage: " + massage + " notified!");
    }
}
