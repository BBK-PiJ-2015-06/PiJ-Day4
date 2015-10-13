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

int hexToDec(String s){
	int output = 0;
	for(int count = 0; count < s.length; count++) {
		char c = s.charAt(count);
		output
	
	}
}

String decToHex(int i){
}


println "Please insert an integer in either decimal or hexadecimal format: ";
String s = System.console().readLine();
readNumType(s);
