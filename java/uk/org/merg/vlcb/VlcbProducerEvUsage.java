/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate_java.sh from vlcb-defs.csv
 */

package uk.org.merg.vlcb;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum VlcbProducerEvUsage {
// 
// Producer service EV usage
// 
	PRODUCER_EV_NOT_SPECIFIED(0x00),	//Not specified
	PRODUCER_EV_HAPPENING(0x01),	//Happenings
	PRODUCER_EV_SLOTS(0x02);	//Slots

    private final int v;

    private VlcbProducerEvUsage(int v) {
        this.v = v;
    }

    public int value() {
        return v;
    }
}
