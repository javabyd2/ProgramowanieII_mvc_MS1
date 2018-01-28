package com.sdabyd2.mvc;

import com.sdabyd2.mvc.controller.GiantController;
import com.sdabyd2.mvc.model.Fatigue;
import com.sdabyd2.mvc.model.GiantModel;
import com.sdabyd2.mvc.model.Health;
import com.sdabyd2.mvc.model.Nourishment;
import com.sdabyd2.mvc.view.GiantView;

public class Main {

    public static void main(String[] args) {
        GiantModel giant1 = new GiantModel(
                Health.HEALTHY,
                Nourishment.NOTHUNGRY,
                Fatigue.NO
        );

        GiantView view = new GiantView();
        GiantController controller = new GiantController(
                giant1, view
        );

        controller.updateView();

        controller.setHealth(Health.DEAD);
        controller.updateView();
    }
}
