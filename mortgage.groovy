class Mortgage {

	double borrowed;
	int years;
	double interest;
	
	Mortgage(double borrowed, int years, double interest) {
		this.borrowed = borrowed;
		this.years = years;
		this.interest = interest;
	}
	
	double getTotal() {
	}
	
	double getYearlyPay() {
	}
	
	double getYearsToPayInterest() {
	}
}

println "Please insert the total amount borrowed for a mortgage.";
print "> ";
String s = System.console().readLine();
double d1 = Double.parseDouble(s);

println "Please insert the number of years to pay it back.";
print "> ";
s = System.console().readLine();
int num1 = Integer.parseInt(s);

println "Please insert the interest rate.";
print "> ";
s = System.console().readLine();
double d2 = Double.parseDouble(s);

Mortgage myMortgage = new Mortgage(d1, num1, d2);
