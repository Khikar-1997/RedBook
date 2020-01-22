package com.company;

import com.company.animal.Animal;
import com.company.animal.bird.red.book.birds.Eagle;
import com.company.animal.bird.red.book.birds.Seagul;
import com.company.animal.mammal.red.book.mammals.Leopard;
import com.company.animal.mammal.red.book.mammals.Lion;
import com.company.animal.reptile.red.book.reptiles.Anaconda;
import com.company.animal.reptile.red.book.reptiles.Krokodaile;
import com.company.animal.reptile.red.book.reptiles.Moghes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Moghes moghes = new Moghes("Moghes ", RiskLevel.LOW);
        Anaconda anaconda = new Anaconda("Anaconda ", RiskLevel.MEDIUM);
        Krokodaile krokodaile = new Krokodaile("Krokodaile ", RiskLevel.HIGH);
        Seagul seagul = new Seagul("Seagul ", RiskLevel.LOW);
        Eagle eagle = new Eagle("Eagle ", RiskLevel.MEDIUM);
        Lion lion = new Lion("Lion ", RiskLevel.HIGH);
        Leopard leopard = new Leopard("Leopard ", RiskLevel.LOW);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(moghes);
        animals.add(anaconda);
        animals.add(krokodaile);
        animals.add(seagul);
        animals.add(eagle);
        animals.add(lion);
        animals.add(leopard);
        RedBook redBook = new RedBook(animals);
        ArrayList<Animal> animalsRedBook = redBook.getAnimalsByRiskLevel(RiskLevel.LOW);
        System.out.println(animalsRedBook.size());

        for (int i = 0; i < animalsRedBook.size(); i++) {
            System.out.println(animalsRedBook.get(i).getName() + animalsRedBook.get(i).getRiskLevel());
        }


    }
}
