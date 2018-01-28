package com.sdabyd2.mvc.model;

public enum Fatigue {

    YEA("yes"), NO("no"), SLEEPING("sleeping");

    private String title;

    Fatigue(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Fatigue{" +
                "title='" + title + '\'' +
                '}';
    }
}
