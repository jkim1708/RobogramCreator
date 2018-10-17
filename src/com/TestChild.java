package com;

public class TestChild extends TestParent{

    String teintColor;


    public TestChild(String teintColor) {
        super("brown");
        this.teintColor = teintColor;
    }

    public String getTeintColor() {
        return teintColor;
    }
}
