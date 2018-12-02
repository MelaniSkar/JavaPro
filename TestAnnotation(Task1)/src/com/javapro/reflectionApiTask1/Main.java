package com.javapro.reflectionApiTask1;

import com.javapro.reflectionApiTask1.Complex.ComplexTestClass;
import com.javapro.reflectionApiTask1.Simple.SimpleTestClass;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
                                                                        InvocationTargetException {

        ComplexTestClass complexTestClass = new ComplexTestClass();
        SimpleTestClass testClass = new SimpleTestClass();
        testClass.doTest();
        complexTestClass.doTest();

    }
}
