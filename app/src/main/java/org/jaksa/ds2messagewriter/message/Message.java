package org.jaksa.ds2messagewriter.message;

import org.jaksa.ds2messagewriter.messageparticles.FirstOrThirdRowContainer;
import org.jaksa.ds2messagewriter.messageparticles.ParticleHelper;
import org.jaksa.ds2messagewriter.messageparticles.enums.FirstOrThirdRowText;
import org.jaksa.ds2messagewriter.messageparticles.enums.MiddleRow;

/**
 * Created by Jaksa on 09/02/2015.
 */
public class Message {
    FirstOrThirdRowContainer firstRow;
    MiddleRow middleRow;
    FirstOrThirdRowContainer thirdRow;

    public Message(){
        // instantiate as blanks (nulls)
    }

    public boolean isValid(){
        if(isOneRowMessage()){
            return firstRow.isValid();
        }
        if(isThreeRowMessage()){
            return firstRow.isValid() && thirdRow.isValid();
        }

        return false;
    }

    public boolean isOneRowMessage(){
        if(firstRow != null && middleRow == null && thirdRow == null){
            return true;
        }
        return false;
    }

    public boolean isThreeRowMessage(){
        if(firstRow !=null && middleRow != null && thirdRow != null){
            return true;
        }
        return false;
    }

    public void setFirstRow(FirstOrThirdRowContainer firstRow){
        this.firstRow = firstRow;
    }

    public void setMiddleRow(MiddleRow middleRow){
        this.middleRow = middleRow;
    }

    public void setThirdRow(FirstOrThirdRowContainer thirdRow){
        this.thirdRow = thirdRow;
    }

    public String getMessage(){
        if(isOneRowMessage()){
            return ParticleHelper.formatStringShort(firstRow.toString());
        }
        if(isThreeRowMessage()){
            return ParticleHelper.formatStringLong(firstRow.toString())
                    + ParticleHelper.formatStringLong(middleRow.toString())
                    + ParticleHelper.formatStringShort(thirdRow.toString());
        }
        throw new IllegalStateException("Invalid message. "
                + "Please check .isValid() before attempting to construct final message.");
    }

    @Override
    public String toString(){
        return getMessage();
    }
}
