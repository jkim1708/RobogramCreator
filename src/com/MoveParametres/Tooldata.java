package com.MoveParametres;

import com.sun.source.tree.Scope;

import java.util.ArrayList;

public class Tooldata {
    // == variables ==
    private static ArrayList<String[]> tooldatas = new ArrayList<String[]>(); //1. Dimension ArrayList 2.Dimension Array, which contains name an dScOPE of robtarget
    private static final String value= ":=[[ TRUE, [[0,0,0], [0,0,0,0]], [0, [0,0,0], [1, 0, 0, 0], 0, 0, 0]]]";
    private static final String scope = "TASK PERS";
    private static final String dataType= "tooldata";

    // == constructors ==
    public Tooldata() {
    }

    // == methods ==
    public void addTooldata(String name, Scope scope){
        String[] arrStr = new String[2];
        arrStr[0] = name;
        arrStr[1] = scope.toString();
        this.tooldatas.add(arrStr);
    }

    public String getTooldata(String name) {
        int i = 0;
        String[] arrResult = new String[2];

        while (arrResult[0].equals(name)) {
            arrResult = this.tooldatas.get(i);
            i++;
        }
        i = i - 1;

        return arrResult[0] + " " + dataType + " " + arrResult[1] + value + ";";
    }




}
