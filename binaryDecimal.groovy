// Method for converting binary into decimal.
int binary2decimal(String str) {
	int output = 0;
	int leng = str.length();
	for (int count = 0; count < leng; count++) {
		char c = str.charAt(count);
		if (c == '1') {
			output = output + (power(2,leng-count-1));
		}
	}
	return output;	
}

//Method for converting decimal into binary
String decimal2binary(int i) {
	boolean finished = false;
	String output = "";
	while (!finished) {
		if (i%2 == 0) {
			output = "0" + output;
		} else {
			output ="1" + output;
		}
		i = i/2
		if (i == 0) {
			finished = true
		}
	}
	return output
}

// Method for finding base "i" to the power of "j".
int power(int i, int j) {
	int output = 1
	for (int count = 0; count < j; count++) {
		output = output * i
	}
	return output;
}

println "Please select what you want to do from the menu below: "
println " ";
println "1 - Convert a binary number into a decimal number"
println "2 - Convert a decimal number into a binary number"
String s = System.console().readLine();
int choice = Integer.parseInt(s);
switch (choice) {
case 1:
	print "Please enter a binary number: ";
	String binary = System.console().readLine();
	int result = binary2decimal(binary);
	println binary + " as a decmimal number is " + result;
	break;
case 2:
	print "Please enter a decimal integer: ";
	String decimal = System.console().readLine();
	int intdecimal = Integer.parseInt(decimal);
	String result = decimal2binary(intdecimal);
	println decimal + " as a binary number is " + result;
	break;
default:
	println "This is not a valid choice."
	break;
}

