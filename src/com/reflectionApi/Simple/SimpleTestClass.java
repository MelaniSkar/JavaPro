package com.reflectionApi.Simple;

import com.reflectionApi.Main.Test;

public class SimpleTestClass {

    //Написать код, который вызовет метод помеченный этой аннотацией и передаст параметры аннотации в вызываемый метод

    @Test(a = 2, b = 5)
    public void test(int _a, int _b) {
        System.out.println(_a + " + " + _b + " = " + (_a + _b));
    }

    public void doTest() throws NoSuchMethodException {
        int _a = getClass().getMethod("test", int.class, int.class).getAnnotation(Test.class).a();
        int _b = getClass().getMethod("test", int.class, int.class).getAnnotation(Test.class).b();
        test(_a, _b);
    }
}
