package com.reflectionApi.Complex;

import com.reflectionApi.Main.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ComplexTestClass {

    //Написать код, который вызовет метод помеченный этой аннотацией и передаст параметры аннотации в вызываемый метод

    @Test(a = 2, b = 5)
    public void test(int _a, int _b) {
        System.out.println(_a + " * " + _b + " = " + (_a * _b));
    }

    public void doTest() throws InvocationTargetException, IllegalAccessException {

        Method[] mds = getClass().getMethods();

        for (Method m : mds) {

            if(m.isAnnotationPresent(Test.class)) {
                Test test = m.getAnnotation(Test.class);
                m.invoke(this, test.a(), test.b());
            }

        }
    }
}
