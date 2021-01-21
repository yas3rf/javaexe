package com.company;

public class VipPerson {

    private String name;
    private int limit;
    private String email;

    public VipPerson(String name, int limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public VipPerson(String name, int limit) {
        this(name,limit,"email");
    }

    public VipPerson() {
        this("Unknown",0,"Unknown");
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
