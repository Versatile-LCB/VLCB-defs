/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate_java.sh from vlcb-defs.csv
 */

package uk.org.merg.vlcb;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum VlcbCabSigAspect2 {
// 
// Aspect codes for CDAT_CABSIG
// 
// Second Aspect byte
// 
	SASP_LIT(0),	//Set bit 0 to indicate lit
	SASP_LUNAR(1);	//Set bit 1 for lunar indication
// 
// Remaining bits in second aspect byte yet to be defined - can be used for other signalling systems

    private final int v;

    private VlcbCabSigAspect2(int v) {
        this.v = v;
    }

    public int value() {
        return v;
    }
}
