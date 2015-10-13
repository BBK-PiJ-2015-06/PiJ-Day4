// Method for testing whether input is decimal or hexadecimal.
void readNumType(String s){
	if (s.length() > 2 && s.substring(0,2) == "0x") {
		println "This is a hexadecimal number."
		println "Its decimal equivalent is: " + hexToDec(s);
	} else {
		int i = Integer.parseInt(s);
		println "This is a decimal number."
		println "Its hexadecimal equivalent is: " + decToHex(i);
	}
}

// Method for converting a hexadecimal number into a decimal number.
int hexToDec(String s){
	int output = 0;
	int index = 0;
	s = s.substring(2);
	for(int count = 0; count < s.length(); count++) {
		char c = s.charAt(count);
		switch (c) {
		case 'a':
			index = 10;
			break;
		case 'b':
			index = 11;
			break;
		case 'c':
			index = 12;
			break;
		case 'd':
			index = 13;
			break;
		case 'e':
			index = 14;
			break;
		case 'f':
			index = 15;
			break;
		default:
			index = Character.getNumericValue(c);
			break;
		}
		output = (index * Math.pow(16,s.length()-count-1)) + output;
	}
	return output;
}

// Method for converting a decimal number to a hexadecimal number.
String decToHex(int i){
	boolean finished = false;
	String output = "";
	int remainder = 0;
	while(!finished) {
		if(i%16 <= 9) {
			remainder = i%16;
			output = remainder + output;
		} else if(i%16 == 10) {
			output = "a" + output;
		} else if(i%16 == 11) {
			output = "b" + output;
		} else if(i%16 == 12) {
			output = "c" + output;	
		} else if(i%16 == 13) {
			output = "d" + output;
		} else if(i%16 == 14) {
			output = "e" + output;
		} else {
			output = "f" + output;
		}
		i = i/16;
		if(i == 0) {
			finished = true;
		}
	}
	return "0x" + output;
}

// Test
println "Please insert an integer in either decimal or hexadecimal format: ";
String s = System.console().readLine();
readNumType(s);