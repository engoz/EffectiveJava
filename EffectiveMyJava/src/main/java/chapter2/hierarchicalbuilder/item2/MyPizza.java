package chapter2.hierarchicalbuilder.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class MyPizza {

    public enum Size { SMALL,MEDIUM,LARGE }

    public enum Topping {HAM,MUSHROOM,ONION,PEPPER,SAUSAGE}

    final Set<Topping> toppings;

    abstract static class MyBuilder<T extends MyBuilder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }



        abstract MyPizza build();

        protected abstract T self();

    }

    MyPizza(MyBuilder<?> builder){
        toppings = builder.toppings.clone();
    }

}
