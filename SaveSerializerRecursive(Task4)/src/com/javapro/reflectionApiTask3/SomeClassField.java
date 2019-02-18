package com.javapro.reflectionApiTask3;

public class SomeClassField {

    @Save
    private SomeClassField2 field0;

    @Save
    private String field1;

    @Save
    private int field2;

    private boolean field3;

    @Save
    private int field4;

    public SomeClassField() {
    }

    public SomeClassField(SomeClassField2 field0, String field1, int field2, boolean field3, int field4) {
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

}
