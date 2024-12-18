package lession7.bt1;

import lession7.bt1.animal.Animal;
import lession7.bt1.animal.Chicken;
import lession7.bt1.animal.Tiger;
import lession7.bt1.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }
    }
}
