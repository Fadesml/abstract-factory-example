package ru.fadesml.patterns;

import ru.fadesml.patterns.factory.FamilyFactory;
import ru.fadesml.patterns.factory.FamilyFemaleFactory;
import ru.fadesml.patterns.factory.FamilyMaleFactory;

public class Main {
    public static final FamilyFactory maleFactory = new FamilyMaleFactory();
    public static final FamilyFactory femaleFactory = new FamilyFemaleFactory();

    public static void main(String[] args) {
        System.out.println(maleFactory.createChild().getClass());
        System.out.println(maleFactory.createParent().getClass());
        System.out.println(maleFactory.createGrand().getClass());
    }
}
