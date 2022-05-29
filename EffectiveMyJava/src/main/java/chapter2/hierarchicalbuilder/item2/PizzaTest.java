package chapter2.hierarchicalbuilder.item2;

import static chapter2.hierarchicalbuilder.item2.MyPizza.Size.SMALL;

public class PizzaTest {
    public static void main(String[] args) {
        NyiPizza nyiPizza = new NyiPizza.NyiBuilder(SMALL)
                .addTopping(MyPizza.Topping.SAUSAGE)
                .addTopping(MyPizza.Topping.ONION).build();
        System.out.println(nyiPizza);
    }
}
