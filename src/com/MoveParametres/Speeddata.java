package com.MoveParametres;

import java.util.ArrayList;

public class Speeddata {

    //== variables ==
    public static final String scope="TASK PERS";
    public static final String datatype="speeddata";

    //== enums ==

    public enum SPEEDCONSTANTS {
        valueVMax(datatype + "vMax:=[3000,500,5000,1000]"), //vMax
        valueVFast(datatype + "vFast:=[2000,500,5000,1000]"), //vFast
        valueVMid(datatype + "vMid:=[1000,500,5000,1000]"), //vMid
        valueVSlow(datatype + "vSlow:=[500,500,5000,1000]"),//vSlow
        valueVVerySlow(datatype + "vVerySlow:=[200,500,5000,1000]");  //vVerySlow

        public final String value;
        private SPEEDCONSTANTS(String value){
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    // == constructors ==
    public Speeddata() {
    }

}
