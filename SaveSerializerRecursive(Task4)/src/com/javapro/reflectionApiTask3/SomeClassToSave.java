package com.javapro.reflectionApiTask3;

public class SomeClassToSave {

    @Save
    private String field1;

    @Save
    SomeClassField field2;

    @Save
    private int field3;

    private String field4;

    public SomeClassToSave() {
    }

    public SomeClassToSave(String field1, SomeClassField field2, int field3, String field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

}
