package com.javapro.reflectionApiTask3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Serializer {

    public static void serializeToFile(Object object, String path) throws IOException, IllegalAccessException {

        FileWriter fileWriter = new FileWriter(path);

        String serialized = Serializer.serialize(object);

        fileWriter.write(serialized);

        fileWriter.close();

    }

    public static String serialize(Object object) throws IllegalAccessException {

        String serialized = "";

        Class<?> objectClass = object.getClass();

        Field[] fields = objectClass.getDeclaredFields();

        for (Field field : fields) {

            if(field.isAnnotationPresent(Save.class)) {

                if (!field.isAccessible())
                    field.setAccessible(true);

                String serializedField = field.get(object).toString();

                serialized += serializedField;

                serialized += "_;";
            }

        }

        return serialized;

    }

    public static void deserializeFromFile(Object object, String path) throws FileNotFoundException,
                                                                              IllegalAccessException {

        Field[] fields = object.getClass().getDeclaredFields();

        Scanner scanner = new Scanner(new File(path)).useDelimiter("_;");

        for (Field field : fields) {

            if (field.isAnnotationPresent(Save.class)) {

                if (!field.isAccessible())
                    field.setAccessible(true);

                String fieldValue = scanner.next();

                Type type = field.getType();

                try {

                    field.set(object, ((Class) type).cast(fieldValue));

                }   catch (ClassCastException e) {

                    if (type.equals(Integer.TYPE))
                        field.set(object, Integer.valueOf(fieldValue));
                    else if (type.equals(Double.TYPE))
                        field.set(object, Double.valueOf(fieldValue));
                    else if (type.equals(Boolean.TYPE))
                        field.set(object, Boolean.valueOf(fieldValue));

                }

            }

        }

    }

}
