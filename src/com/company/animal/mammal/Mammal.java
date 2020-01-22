package com.company.animal.mammal;

import com.company.RiskLevel;
import com.company.animal.Animal;

public abstract class Mammal extends Animal {
    //region Constructors

    public Mammal(String name, RiskLevel riskLevel) {
        super(name, riskLevel);
    }

    public Mammal() {
    }

    //endregion
}
