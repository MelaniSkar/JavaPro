package com.javapro.reflectionApiTask2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TextContainer textContainer = new TextContainer();

        Class<?> textContainerClass = textContainer.getClass();

        if (!textContainerClass.isAnnotationPresent(SaveTo.class)) {
            System.out.println("SaveTo annotation isn't present");
            return;
        }

        Method[] methods = textContainerClass.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class))
                method.invoke(textContainer, textContainerClass.getAnnotation(SaveTo.class).path());
        }
    }
}
