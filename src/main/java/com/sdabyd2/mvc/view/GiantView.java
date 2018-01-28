package com.sdabyd2.mvc.view;

import com.sdabyd2.mvc.model.GiantModel;

public class GiantView {

    public GiantView() {
    }

    public void displayGiant(GiantModel giantModel) {
        System.out.println(giantModel.toString());
    }
}
