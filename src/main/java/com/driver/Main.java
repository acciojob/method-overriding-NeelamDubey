package com.driver;

public class Main {
    public Main() {

    }

    public void main(String[] args) {
        B obj = new B();
        obj.meth();
        obj.meth();
    }

    class A {
        String meth() {
            return "Invoking method from class A";
        }
    }
    static class B extends A {
        B obj = new B();

        String meth() {
            return "Method is overridden in Extended class B";
        }
    }
}
