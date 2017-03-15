package org.jaksa.ds2messagewriter.messageparticles;

/**
 * Created by Jaksa on 09/02/2015.
 */
public class ParticleHelper {

    private ParticleHelper(){
        // Helper class. Should not be instantiated.
    }

    public static final String BLANK = "";
    public static final String ETC = "...";
    public static final String EXCLAIM = "!";
    public static final String QUESTION = "!";

    public static String formatString(String string){
        return formatStringLong(string);
    }

    public static String formatStringShort(String string){
        return string.trim();
    }

    public static String formatStringLong(String string){
        return string.trim() + " ";
    }
}
