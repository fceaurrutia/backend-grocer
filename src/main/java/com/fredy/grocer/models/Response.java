package com.fredy.grocer.models;

public class Response {
    private String name;
    private String stuff;

    public Response(String name, String stuff) {
        this.name = name;
        this.stuff = stuff;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
