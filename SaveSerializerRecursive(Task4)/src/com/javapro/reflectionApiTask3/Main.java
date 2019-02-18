//Написать код, который сериализирует и десериализирует в/из файла все значения полей класса,
// которые отмечены аннотацией @Save.

package com.javapro.reflectionApiTask3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {

        SomeClassField2 someClassField2 = new SomeClassField2(true, 1, "pro");

        SomeClassField someClassField = new SomeClassField(someClassField2, "kiev", 0, true, 0);

        SomeClassToSave classToSave = new SomeClassToSave("java", someClassField, 7, "ua");

        //Serializer.deserializeFromFile(classToSave, "input.txt");

        Serializer.serializeToFile(classToSave, "output.txt");

    }
}
