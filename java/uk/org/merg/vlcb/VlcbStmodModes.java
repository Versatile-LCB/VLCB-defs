/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate_java.sh from vlcb-defs.csv
 */

package uk.org.merg.vlcb;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum VlcbStmodModes {
// 
// 
// Modes for STMOD
// 
	TMOD_SPD_MASK(3),	//
	TMOD_SPD_128(0),	//
	TMOD_SPD_14(1),	//
	TMOD_SPD_28I(2),	//
	TMOD_SPD_28(3);	//

	private final int v;

	private VlcbStmodModes(int v) {
		this.v = v;
	}

	public int value() {
		return v;
	}
}
