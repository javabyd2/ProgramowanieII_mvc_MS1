package com.sdabyd2.mvc.model;

public enum Health {

    HEALTHY("healthy"), NOTHEALTHY("nothealthy"), DEAD("dead");

    private String title;

    Health(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Health{" +
                "title='" + title + '\'' +
                '}';
    }
}
