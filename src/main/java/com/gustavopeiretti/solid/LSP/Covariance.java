package com.gustavopeiretti.solid.LSP;

public class Covariance {

    public abstract class Foo {
        public abstract Number calculateSomething();
    }

    public class FooSub extends Foo {

        // This does not follow the covariance rule,
        // we should return a number or subtype of number
        // Java does not allow this
//        @Override
//        public String calculateSomething() { // error this does not compile
//            return null;
//        }

        // Correct. Integer is a subtype of Number
        public Integer calculateSomething() {
            return 123;
        }
    }

}
