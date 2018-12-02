package com.javapro.reflectionApiTask3;

import java.io.IOException;

public class SomeClassToSave {

    @Save
    private String field1 = "javapro";

    private int field2 = 0;

    @Save
    private int field3 = 0;

    public SomeClassToSave() {
    }

    public SomeClassToSave(String field1, int field2, int field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public void decerialize(String path) throws IOException, ClassNotFoundException, IllegalAccessException {





    }
}
