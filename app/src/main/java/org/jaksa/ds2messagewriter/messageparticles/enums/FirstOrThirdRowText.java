package org.jaksa.ds2messagewriter.messageparticles.enums;

import static org.jaksa.ds2messagewriter.messageparticles.ParticleHelper.*;

/**
 * Created by Jaksa on 09/02/2015.
 */
public enum FirstOrThirdRowText {
    X_AHEAD(BLANK, "ahead"),
    X_REQUIRED_AHEAD(BLANK, "required ahead"),
    BE_WARY_OF_X("be wary of", BLANK),
    TRY_X("try", BLANK),
    WEAKNESS_X("weakness", BLANK),
    VISIONS_OF_X_ETC("visions of", ETC),
    BLANK_X_BLANK(BLANK, BLANK),
    X_EXCLAIM(BLANK, EXCLAIM),
    X_QUESTION(BLANK, QUESTION),
    X_ETC(BLANK, ETC),
    HURRAH_FOR_X("hurrah for", EXCLAIM);

    private String first;
    private String last;

    FirstOrThirdRowText(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}
