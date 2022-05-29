package chapter2.hierarchicalbuilder.item2;

import java.util.Objects;
import java.util.StringTokenizer;

public class NyiPizza extends MyPizza {

    private final Size size;

    public static class NyiBuilder extends MyPizza.MyBuilder<NyiBuilder> {

        private final Size size;

        public NyiBuilder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NyiPizza build() {
            return new NyiPizza(this);
        }

        @Override
        protected NyiBuilder self() {
            return this;
        }
    }


    public NyiPizza(NyiBuilder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "New York Pizza with " + toppings;
    }
}
