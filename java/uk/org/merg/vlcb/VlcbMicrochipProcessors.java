/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate_java.sh from vlcb-defs.csv
 */

package uk.org.merg.vlcb;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/
// 
// 
// 
// 
// 
// 

public enum VlcbMicrochipProcessors {
// 
// Microchip Processor type codes (identifies to FCU for bootload compatibility)
// 
	P18F2480(1),	//
	P18F4480(2),	//
	P18F2580(3),	//
	P18F4580(4),	//
	P18F2585(5),	//
	P18F4585(6),	//
	P18F2680(7),	//
	P18F4680(8),	//
	P18F2682(9),	//
	P18F4682(10),	//
	P18F2685(11),	//
	P18F4685(12),	//
// 
	P18F25K80(13),	//
	P18F45K80(14),	//
	P18F26K80(15),	//
	P18F46K80(16),	//
	P18F65K80(17),	//
	P18F66K80(18),	//
	P18F25K83(19),	//
	P18F26K83(20),	//
	P18F27Q84(21),	//
	P18F47Q84(22),	//
	P18F27Q83(23),	//
	P18F14K22(25),	//
// 
	P32MX534F064(30),	//
	P32MX564F064(31),	//
	P32MX564F128(32),	//
	P32MX575F256(33),	//
	P32MX575F512(34),	//
	P32MX764F128(35),	//
	P32MX775F256(36),	//
	P32MX775F512(37),	//
	P32MX795F512(38);	//

	private final int v;

	private VlcbMicrochipProcessors(int v) {
		this.v = v;
	}

	public int value() {
		return v;
	}
}
