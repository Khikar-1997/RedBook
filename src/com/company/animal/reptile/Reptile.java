package com.company.animal.reptile;

import com.company.RiskLevel;
import com.company.animal.Animal;

public abstract class Reptile extends Animal {
    //region Constructors

    public Reptile(String name, RiskLevel riskLevel) {
        super(name, riskLevel);
    }

    public Reptile() {
    }

    //endregion
}
