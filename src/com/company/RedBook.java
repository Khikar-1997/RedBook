package com.company;

import com.company.animal.Animal;

import java.util.ArrayList;
import java.util.Objects;

public class RedBook {
    //region Propertys

    private ArrayList<Animal> animalsOfRedBook;

    //endregion

    //region Constructors

    public RedBook(ArrayList<Animal> animalsOfRedBook) {
        this.animalsOfRedBook = animalsOfRedBook;
    }

    public RedBook() {
    }

    //endregion

    //region Public Methods

        public ArrayList<Animal> getAnimalsByRiskLevel(RiskLevel riskLevel){
        ArrayList<Animal> animals = new ArrayList<>();
            for (int i = 0; i < animalsOfRedBook.size(); i++) {
                if(animalsOfRedBook.get(i).getRiskLevel().equals(riskLevel)){
                    animals.add(animalsOfRedBook.get(i));
                }
            }
            return animals;
        }

    //endregion

    //region Getter and Setter

    public ArrayList<Animal> getAnimalsOfRedBook() {
        return animalsOfRedBook;
    }

    public void setAnimalsOfRedBook(ArrayList<Animal> animalsOfRedBook) {
        this.animalsOfRedBook = animalsOfRedBook;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RedBook redBook = (RedBook) o;
        return Objects.equals(animalsOfRedBook, redBook.animalsOfRedBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalsOfRedBook);
    }

    @Override
    public String toString() {
        return "RedBook{" +
                "animalsOfRedBook=" + animalsOfRedBook +
                '}';
    }

    //endregion
}
