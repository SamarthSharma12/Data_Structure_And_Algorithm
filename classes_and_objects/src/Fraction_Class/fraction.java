package Fraction_Class;

public class fraction {
private int numerator ;
private int denominator;
public fraction(int numerator , int denominator) {
	this.numerator = numerator;
	this.denominator = denominator;
	simplify();
}
public void setNumerator(int nr) {
	this.numerator = nr;
	simplify();
}
public void setDenominator(int den) {
	if(denominator == 0) {
		return;
	}
	else {
	this.denominator = den;
	simplify();
}
}
public int getNumerator() {
	return numerator;
}
public int getDenominator() {
	return denominator;
}
private void simplify() {
	int hcf = 1;
	int smaller = Math.min(numerator, denominator);
	for(int i = 2; i <= smaller ; i++) {
		if(numerator % i == 0 && denominator % i == 0 ) {
			hcf = i;
		}
	}
numerator = numerator/hcf;
denominator = denominator/hcf;
}
public void print() {
	if (denominator ==1 ){
		System.out.println(numerator);
		}
	else {
		System.out.println(numerator+"/"+denominator);
	}
}
public void add(fraction f2) {
	this.numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
	this.denominator = this.denominator*f2.denominator;
	simplify();
}
public void multiply(fraction f2) {
	this.numerator = this.numerator*f2.numerator;
	this.denominator = this.denominator*f2.denominator;
	simplify();
}
public static fraction add(fraction f1,fraction f2) {
	int newnumerator = f1.numerator*f2.denominator+f1.denominator*f2.numerator;
	int newdenominator = f1.denominator*f2.denominator;
	fraction f = new fraction(newnumerator,newdenominator);
	return f;
}
}
