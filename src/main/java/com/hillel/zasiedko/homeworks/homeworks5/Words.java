package com.hillel.zasiedko.homeworks.homeworks5;

public class Words {

    private String name;
    private int occurrence;

    public Words(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "\n name: \"" + name + "\", occurrence: " + occurrence;
    }
}
