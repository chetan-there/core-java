package com.ct.nestedclass;

interface Greeting {
    void sayHello();
}

public class TestAnonymous {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        g.sayHello();
    }
}
