package org.jaksa.ds2messagewriter.messageparticles;

import org.jaksa.ds2messagewriter.messageparticles.enums.FirstOrThirdRowText;
import static org.jaksa.ds2messagewriter.messageparticles.ParticleHelper.BLANK;

/**
 * Created by Jaksa on 09/02/2015.
 */
public class FirstOrThirdRowContainer {

    private FirstOrThirdRowText particleBig;
    private String particleSmall;

    FirstOrThirdRowContainer(FirstOrThirdRowText particleBig, String particleSmall){
        this.particleBig = particleBig;
        this.particleSmall = particleSmall;
    }

    public boolean isValid(){
        return particleSmall!=null && !particleSmall.equals("");
    }

    @Override
    public String toString(){
        if(!isValid()){
            throw new IllegalStateException("Can't create a row without a middle particle");
        }
        return appendSpaces(particleBig.getFirst())
                + appendSpaces(particleSmall)
                + particleBig.getLast();
    }

    private String appendSpaces(String string) {
        if(string == BLANK){
            return BLANK;
        }
        return ParticleHelper.formatStringLong(string);
    }
}
