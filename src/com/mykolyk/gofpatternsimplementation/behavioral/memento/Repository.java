package com.mykolyk.gofpatternsimplementation.behavioral.memento;

public class Repository {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
