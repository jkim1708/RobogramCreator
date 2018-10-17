package com.CreateJobs;

import com.CONSTANTS_AND_HEADERS.Header;
import com.MoveInstructions.MoveJoint;
import com.MoveInstructions.MoveLinear;
import com.MoveParametres.*;

import static com.MoveParametres.Zonedata.ZONECONSTANTS.*;

public class Job {
    int jobNumber;
    StringBuilder jobBuilder = new StringBuilder();
    Header jobHeader = new Header();

    public enum JobMode {
        PICK, PLACE, MOVEBY
    }

    public Job(int jobNumber) {

        this.jobNumber = jobNumber;


        jobBuilder= new StringBuilder();
        jobBuilder.append(jobHeader);
        jobBuilder.append("PROC Job_"+String.valueOf(jobNumber)+"()"+System.lineSeparator());
        jobBuilder.append("ENDPROC");
    }

//    public String createJob(JobMode jobMode,Wobjdata station,Tooldata tool){
//        Robtarget pPrePoint = new Robtarget("p"+station.getName()+"00_"+"PP", SCOPE.TASKPERS);
//        Robtarget pGripPoint = new Robtarget("p"+station.getName()+"01_"+"GP", SCOPE.TASKPERS);
//        Robtarget pLoadPoint = new Robtarget("p"+station.getName()+"01_"+"LP", SCOPE.TASKPERS);
//        Robtarget pEndPoint = new Robtarget("p"+station.getName()+"02"+"EP", SCOPE.TASKPERS);
//        Robtarget pTransitPoint = new Robtarget("p"+station.getName()+"99"+"TP", SCOPE.TASKPERS);
//
//        Speeddata vVerySlow = new Speeddata("vVerySlow",Speeddata.SPEEDCONSTANTS.valueV200);
//        Speeddata vSlow = new Speeddata("vSlow",Speeddata.SPEEDCONSTANTS.valueV500);
//        Speeddata vMid = new Speeddata("vMid",Speeddata.SPEEDCONSTANTS.valueV1000);
//        Speeddata vFast = new Speeddata("vFast",Speeddata.SPEEDCONSTANTS.valueV2000);
//        Speeddata vMax = new Speeddata("vMax",Speeddata.SPEEDCONSTANTS.valueV3000);
//
//        Zonedata finePoint= new Zonedata("",Zonedata.ZONECONSTANTS.valueFINE);
//        Zonedata zSlow= new Zonedata("",Zonedata.ZONECONSTANTS.valueZ5);
//        Zonedata zMid= new Zonedata("",Zonedata.ZONECONSTANTS.valueZ20);
//        Zonedata zFast= new Zonedata("",Zonedata.ZONECONSTANTS.valueZ50);
//        Zonedata zMAx= new Zonedata("",Zonedata.ZONECONSTANTS.valueZ100);
//
//        switch (jobMode) {
//            case PICK:
//                jobHeader = new Header("PROC Job_" + String.valueOf(jobNumber) + "() " , "picks part from station: " + station.getName());
//                MoveJoint mv00PP_station_Pick = new MoveJoint(pPrePoint,tool,station,vFast,zFast);
//                MoveLinear mv01GP_station_Pick = new MoveLinear(pGripPoint,tool,station,vSlow,finePoint);
//                MoveJoint mv02EP_station_Pick = new MoveJoint(pEndPoint,tool,station,vFast,zFast);
//                jobBuilder.append(mv00PP_station_Pick.toString()+System.lineSeparator());
//                jobBuilder.append(mv01GP_station_Pick.toString()+System.lineSeparator());
//                jobBuilder.append(mv02EP_station_Pick.toString()+System.lineSeparator());
//
//                break;

//            case PLACE:
//                jobHeader = new Header("PROC Job_" + String.valueOf(jobNumber) + "() " + System.lineSeparator(), "place part in station: " + station.getName());
//                MoveJoint mv00PP_station_Place = new MoveJoint(pPrePoint,tool,station,vFast,zFast);
//                MoveLinear mv01LP_station_Place = new MoveLinear(pLoadPoint,tool,station,vSlow,finePoint);
//                MoveJoint mv02EP_station_Place = new MoveJoint(pEndPoint,tool,station,vFast,zFast);
//                jobBuilder.append(mv00PP_station_Place.toString()+System.lineSeparator());
//                jobBuilder.append(mv01LP_station_Place.toString()+System.lineSeparator());
//                jobBuilder.append(mv02EP_station_Place.toString()+System.lineSeparator());
//
//                break;
//
//            case MOVEBY:
//                jobHeader = new Header("PROC Job_" + String.valueOf(jobNumber) + "() " + System.lineSeparator(), "move by transit point: " + station.getName());
//                MoveLinear mv99TP_station_MoveBy = new MoveLinear(pTransitPoint,tool,station,vFast,zFast);
//                jobBuilder.append(mv99TP_station_MoveBy.toString()+System.lineSeparator());
//                break;
//        }
//
//        return jobBuilder.toString();
//
//    }
//
//
//    @Override
//    public String toString() {
//        return jobBuilder.toString();
//    }
}