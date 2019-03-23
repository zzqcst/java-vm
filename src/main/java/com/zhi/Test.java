package com.zhi;


public class Test {
    public static void main(String[] args) {
        System.out.println(Subclass.value2);
    }

}

class MyClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}

class SuperClass {
    static {
        System.out.println("Superclass init!");
    }

    public static int value = 123;
}

class Subclass extends SuperClass {
    static {
        System.out.println("Subclass init");
    }

    public static final int value2 = 234;
}
