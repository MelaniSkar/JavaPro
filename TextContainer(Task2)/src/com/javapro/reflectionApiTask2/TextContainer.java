package com.javapro.reflectionApiTask2;

import java.io.FileWriter;
import java.io.IOException;


@SaveTo(path = "./savedText")
class TextContainer {

    String text = "javapro";

    @Saver
    public void save (String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(text);
        fileWriter.close();
    }
}
