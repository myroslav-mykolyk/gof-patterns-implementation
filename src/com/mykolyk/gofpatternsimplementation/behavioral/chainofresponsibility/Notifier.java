package com.mykolyk.gofpatternsimplementation.behavioral.chainofresponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String massage, int priorityLevel) {
        if (priorityLevel >= priority) {
            write(massage);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(massage, priorityLevel);
        }
    }

    public abstract void write(String massage);
}
