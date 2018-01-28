package com.sdabyd2.mvc;

import com.sdabyd2.mvc.controller.GiantController;
import com.sdabyd2.mvc.model.Fatigue;
import com.sdabyd2.mvc.model.GiantModel;
import com.sdabyd2.mvc.model.Health;
import com.sdabyd2.mvc.model.Nourishment;
import com.sdabyd2.mvc.view.GiantView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<GiantModel> giants = new ArrayList<>();
    static GiantModel giant;
    static GiantController controller;
    static GiantView view;

    public static void main(String[] args) {
        giant = new GiantModel(
                Health.HEALTHY,
                Nourishment.NOTHUNGRY,
                Fatigue.NO
        );

        view = new GiantView();
        controller = new GiantController(giant, view);

        controller.updateView();

        controller.setHealth(Health.DEAD);
        controller.updateView();

        giants.add(giant);

        System.out.println("");
        setGiantHealth(0, Health.NOTHEALTHY, false);
        setGiantNourishment(0, Nourishment.STRAVING, false);
        setGiantFatigue(0, Fatigue.SLEEPING, true);
    }

    static void setGiantHealth(int giantID, Health health, boolean display) {
        controller = new GiantController(giants.get(giantID), view);
        controller.setHealth(health);
        if (display) controller.updateView();
    }

    static void setGiantNourishment(int giantID, Nourishment nourishment, boolean display) {
        controller = new GiantController(giants.get(giantID), view);
        controller.setNourishment(nourishment);
        if (display) controller.updateView();
    }

    static void setGiantFatigue(int giantID, Fatigue fatigue, boolean display) {
        controller = new GiantController(giants.get(giantID), view);
        controller.setFatigue(fatigue);
        if (display) controller.updateView();
    }
}
