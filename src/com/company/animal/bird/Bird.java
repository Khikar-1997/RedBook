package com.company.animal.bird;

import com.company.RiskLevel;
import com.company.animal.Animal;

public abstract class Bird extends Animal {
    //region Constructors

    public Bird(String name, RiskLevel riskLevel) {
        super(name, riskLevel);
    }

    public Bird() {
    }

    //endregion
}
