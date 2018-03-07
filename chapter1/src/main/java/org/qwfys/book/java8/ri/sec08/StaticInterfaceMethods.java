package org.qwfys.book.java8.ri.sec08;

public class StaticInterfaceMethods {

    public static void main(String[] args) {
        Greeter worldGreeter = Greeter.newInstance("World");
        System.out.println(worldGreeter.greet());
    }
}

interface Greeter {

    String greet();

    static Greeter newInstance(String greeted) {
        return new Greeter() {

            public String greet() {
                return "Hello, " + greeted;
            }
        };
    }
}
