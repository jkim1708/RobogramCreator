package com.MoveInstructions;

import com.MoveParametres.*;

public class MoveJoint {

    Robtarget robtarget;
    Tooldata tooldata;
    Wobjdata wobjdata;
    Speeddata speeddata;
    Zonedata zonedata;

    public MoveJoint(Robtarget robtarget, Tooldata tooldata, Wobjdata wobjdata, Speeddata speeddata, Zonedata zonedata) {
        this.robtarget = robtarget;
        this.tooldata = tooldata;
        this.wobjdata = wobjdata;
        this.speeddata = speeddata;
        this.zonedata = zonedata;
    }

}
