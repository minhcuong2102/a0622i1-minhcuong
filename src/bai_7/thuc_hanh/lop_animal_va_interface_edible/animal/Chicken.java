package bai_7.thuc_hanh.lop_animal_va_interface_edible.animal;

import bai_7.thuc_hanh.lop_animal_va_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "could be fried";
    }
}
