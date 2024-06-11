/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate_java.sh from vlcb-defs.csv
 */

package uk.org.merg.vlcb;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum VlcbArmProcessors {
// 
// ARM Processor type codes (identifies to FCU for bootload compatibility)
// 
	ARM1176JZF_S(1),	//As used in Raspberry Pi
	ARMCortex_A7(2),	//As Used in Raspberry Pi 2
	ARMCortex_A53(3);	//As used in Raspberry Pi 3

    private final int v;

    private VlcbArmProcessors(int v) {
        this.v = v;
    }

    public int value() {
        return v;
    }
}
