package lession7.bt1;

import lession7.bt1.fruit.Apple;
import lession7.bt1.fruit.Fruit;
import lession7.bt1.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
