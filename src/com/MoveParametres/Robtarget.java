package com.MoveParametres;

import java.util.ArrayList;
import java.util.ListIterator;

public class Robtarget {
    //== variables ==
    public static final String value = ":=[[0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0,0,0,0]]";
    public static final String datatype = "robtarget";
    private static ArrayList<String[]> robtargets = new ArrayList<String[]>(); //1. Dimension ArrayList 2.Dimension Array, which contains name an dScOPE of robtarget

    // == constructor ==
    public Robtarget() {
    }

    //== methods ==

    public void addRobtarget(String name, SCOPE scope) {
        String[] arrStr = new String[2];
        arrStr[0] = name;
        arrStr[1] = scope.toString();
        this.robtargets.add(arrStr);
    }

    public String getRobtarget(String name) {
        int i = 0;
        String[] arrResult = new String[2];

        while (arrResult[0].equals(name)) {
            arrResult = this.robtargets.get(i);
            i++;
        }
        i = i - 1;

        return arrResult[0] + " " + datatype + " " + arrResult[1] + value + ";";
    }


}
