package com.mykolyk.gofpatternsimplementation.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin("Admin", chat);
        User user = new SimpleUser("User", chat);
        User user1 = new SimpleUser("User1", chat);

        chat.setAdmin(admin);
        chat.addUser(user);
        chat.addUser(user1);

        user1.sendMessage("Hello, I'm User1!");
        admin.sendMessage("Hello, I'm Admin!");

    }
}
