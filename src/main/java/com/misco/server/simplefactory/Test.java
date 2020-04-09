package com.misco.server.simplefactory;


public class Test {
    public static void main(String[] args) {
        Aclass a = (Aclass) SimpleFactroy.factory("a");
        a.fly();
    }
}
