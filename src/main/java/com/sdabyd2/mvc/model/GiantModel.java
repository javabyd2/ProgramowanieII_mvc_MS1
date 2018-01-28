package com.sdabyd2.mvc.model;

public class GiantModel {

    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;

    public GiantModel(Health health, Nourishment nourishment, Fatigue fatigue) {
        this.health = health;
        this.nourishment = nourishment;
        this.fatigue = fatigue;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", nourishment=" + nourishment +
                ", fatigue=" + fatigue +
                '}';
    }
}
