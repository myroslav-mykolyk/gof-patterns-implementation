package com.mykolyk.gofpatternsimplementation.behavioral.chainofresponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleReportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        simpleReportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleReportNotifier.notifyManager("Simple report massage", Priority.ROUTINE);
        simpleReportNotifier.notifyManager("Email report massage", Priority.IMPORTANT);
        simpleReportNotifier.notifyManager("SMS report massage", Priority.ASAP);
    }
}
