package com.StepSequence;

public class Procedure {
    String parametre1;
    String parametre2;
    String parametre3;

    String procedureInstructions = new String();

    public Procedure() {
    }

    public Procedure(String paramtre1) {
        this.parametre1 = paramtre1;
    }

    public Procedure(String paramtre1, String parametre2) {
        this.parametre1 = paramtre1;
        this.parametre2 = parametre2;
    }

    public Procedure(String paramtre1, String parametre2, String parametre3) {
        this.parametre1 = paramtre1;
        this.parametre2 = parametre2;
        this.parametre3 = parametre3;
    }

    public void createContent(String newContent){
        this.procedureInstructions = newContent;
    }

}
