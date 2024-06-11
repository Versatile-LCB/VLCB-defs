/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate_java.sh from vlcb-defs.csv
 */

package uk.org.merg.vlcb;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum VlcbModeParams {
// 
// Parameters to the MODE op-code
// 
// Exclusive modes
	MODE_UNINITIALISED(0xFF),	//Uninitialised / factory settings
	MODE_SETUP(0),	//Set up mode
	MODE_NORMAL(1),	//Normal operation mode
// Event Teaching Service modes
	MODE_LEARN_ON(0x08),	//Turn on learn mode
	MODE_LEARN_OFF(0x09),	//Turn off learn mode
// Event Acknowledgment Service modes
	MODE_EVENT_ACK_ON(0x0A),	//Turn on event acknowledgements
	MODE_EVENT_ACK_OFF(0x0B),	//Turn off event acknowledgements
// Minimum Node Service modes
	MODE_HEARTBEAT_ON(0x0C),	//Turn on heartbeat
	MODE_HEARTBEAT_OFF(0x0D),	//Turn off heartbeat
// Boot modes
	MODE_BOOT(0x0E);	//PIC Boot loader mode

    private final int v;

    private VlcbModeParams(int v) {
        this.v = v;
    }

    public int value() {
        return v;
    }
}
