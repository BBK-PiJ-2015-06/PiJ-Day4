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
		double output = this.borrowed * (1 + (this.interest/100));
		return output;
	}
	
	double getYearlyPay() {
		double output = getTotal() / this.years;
		return output;
	}
	
	int getYearsToPayInterest() {
		double totalInterest = (this.interest / 100) * this.borrowed;
		int count = 0
		while (totalInterest > 0) {
			totalInterest = totalInterest - getYearlyPay();
			count++;
			}
		return count;
		
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

println "Total amount to be paid:                     " + myMortgage.getTotal();
println "Money to be paid every year:                 " + myMortgage.getYearlyPay();
println "The number of years before interest is paid: " + myMortgage.getYearsToPayInterest();
