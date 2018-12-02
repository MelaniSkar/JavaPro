//Написать код, который сериализирует и десериализирует в/из файла все значения полей класса,
// которые отмечены аннотацией @Save.

package com.javapro.reflectionApiTask3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {

        SomeClassToSave classToSave = new SomeClassToSave();

        Serializer.deserializeFromFile(classToSave, "input.txt");

        Serializer.serializeToFile(classToSave, "output.txt");

    }
}
