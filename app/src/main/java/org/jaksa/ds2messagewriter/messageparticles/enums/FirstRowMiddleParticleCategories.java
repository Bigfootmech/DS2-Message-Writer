package org.jaksa.ds2messagewriter.messageparticles.enums;

/**
 * Created by Jaksa on 09/02/2015.
 */
public enum FirstRowMiddleParticleCategories {
    CREATURES("Creatures"),
    OBJECTS("Objects"),
    TECHNIQUES("Techniques"),
    ACTIONS("Actions"),
    GEOGRAPHY("Geography"),
    ORIENTATION("Orientation"),
    BODY_PARTS("Body parts"),
    ATTRIBUTE("Attribute"),
    CONCEPTS("Concepts"),
    MUSINGS("Musings");

    private String categoryString;

    FirstRowMiddleParticleCategories(String categoryString){
        this.categoryString = categoryString;
    }

    @Override
    public String toString(){
        return categoryString;
    }
}
