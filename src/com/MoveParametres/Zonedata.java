package com.MoveParametres;

public class Zonedata {
    // == vairbales ==
    public static final String scope = "TASK PERS";
    public static final String datatype = "zonedata";

    //== enums ==
    public enum ZONECONSTANTS {

        valueZMax(datatype + "zMax:=[FALSE, 100,150,150,15,150,15]"), //zMAx
        valueZFast(datatype + "zFast:=[FALSE, 50,75,75,7.5,75,7.5]"), //zFast
        valueZMid(datatype + "zMid:=[FALSE, 20,30,30,3,30,3]"), //zMid
        valueZSlow(datatype + "zSlow:=[FALSE, 5,8,8,0.8,8,0.8]"),//zSlow
        valueFINE(datatype + "Finepoint:=[TRUE, 0,0,0,0,0,0 ]");  //Finepoint

        public final String value;

        private ZONECONSTANTS(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    // == constructors ==
    public Zonedata(String name, ZONECONSTANTS zoneconstants) {
    }

}
