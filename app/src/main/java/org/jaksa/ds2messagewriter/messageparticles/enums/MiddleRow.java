package org.jaksa.ds2messagewriter.messageparticles.enums;

/**
 * Created by Jaksa on 09/02/2015.
 */
public enum MiddleRow {
    AND_THEN("and then"),
    BUT("but"),
    THEREFORE("therefore"),
    IN_SHORT("in short"),
    ORR("or"),
    BY_THE_WAY("by the way"),
    COMMA(",");

    private String particleString;

    MiddleRow(String particleString){
        this.particleString = particleString;
    }

    @Override
    public String toString(){
        return particleString;
    }
}
