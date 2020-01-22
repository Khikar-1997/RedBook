package com.company.animal;

import com.company.RiskLevel;

import java.util.Objects;

public abstract class Animal {
    //region Propertys

    private String name;
    private RiskLevel riskLevel;

    //endregion

    //region Constructors

    public Animal(String name, RiskLevel riskLevel) {
        this.name = name;
        this.riskLevel = riskLevel;
    }

    public Animal() {
    }

    //endregion

    //region Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                riskLevel == animal.riskLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, riskLevel);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", riskLevel=" + riskLevel +
                '}';
    }

    //endregion
}
