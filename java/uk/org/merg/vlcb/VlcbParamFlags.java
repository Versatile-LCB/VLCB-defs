/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate_java.sh from vlcb-defs.csv
 */

package uk.org.merg.vlcb;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum VlcbParamFlags {
// 
// Flags in PAR_FLAGS
// 
	PF_NOEVENTS(0),	//Module doesn't support events
	PF_CONSUMER(1),	//Module is a consumer of events
	PF_PRODUCER(2),	//Module is a producer of events
	PF_COMBI(3),	//Module is both a consumer and producer of events
	PF_FLiM(4),	//Module is in FLiM (CBUS)
	PF_NORMAL(4),	//Module is in Normal mode (VLCB)
	PF_BOOT(8),	//Module supports the FCU bootloader protocol
	PF_COE(16),	//Module can consume its own events
	PF_LRN(32),	//Module is in learn mode
	PF_VLCB(64),	//Module is VLCB compatible
	PF_SD(64);	//Module supports Service Discovery (Deprecated in favour of PF_VLCB.)

    private final int v;

    private VlcbParamFlags(int v) {
        this.v = v;
    }

    public int value() {
        return v;
    }
}
