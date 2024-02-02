package com.mykolyk.gofpatternsimplementation.behavioral.mediator;

public class Admin implements User {
    String name;
    Chat chat;

    public Admin(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + ": " + message);
    }
}
