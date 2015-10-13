println "Please choose an option from the menu below: ";
println " ";
println "1 - Convert an hexidecimal number into a decimal number.";
println "2 - Convert a decimal number into an hexidecimal number.";
String s = System.console().readLine();
int i = Integer.parseInt(s);
switch (i) {
case 1:
	print "Enter hexadecimal number to be converted: ";
	String str = System.conosle().readLine();
	int result = hexToDec(str);
	println result;
	break;
case 2:
	print "Enter decimal number to be converted: ";
	String str = System.console().readLine();
	int i = Integer.parseInt(str);
	int result = decToHex(i);
	println result;
	break;
default:
	println "This is not a valid input.";
	break;
}
