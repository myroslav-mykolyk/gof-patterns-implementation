package com.mykolyk.gofpatternsimplementation.behavioral.chainofresponsibility;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("SMS report with massage: " + massage + " notified!");
    }
}
