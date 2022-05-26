package ComplexNumber;

public class Complex {
int real ;
int imaginary;
boolean f = true;
public Complex(int real, int imaginary ) {
	this.real = real;
	this.imaginary  = imaginary ;
}
public void setReal(int rl) {
	this.real = rl;
}
public void setImaginary  (int com) {
	this.imaginary  = com;
}
public int getReal() {
	return real;
}
public int getImaginary() {
	return imaginary;
}
public void print() {
	if(f) {
	System.out.println(real+"+"+imaginary+"i");}
	else {
		System.out.println(real+"-"+imaginary+"i");
	}
}
public void add (Complex c2) {
	this.real = this.real+c2.real;
	this.imaginary = this.imaginary+c2.imaginary;
}
public void multiply(Complex c2) {
	int pro = this.real*c2.real -this.imaginary*c2.imaginary;
 	this.imaginary = (this.real * c2.imaginary)+(this.imaginary*c2.real);
 	this.real = pro;
}
public static Complex add(Complex c1 , Complex c2) {
	int new_real = c1.real+c2.real;
	int new_imaginary = c1.imaginary+c2.imaginary;
	Complex c = new Complex( new_real ,new_imaginary);
	return c;
}
public Complex conjugate() {
	this.real = real;
	this.imaginary =  - imaginary;
	Complex c = new Complex(real,imaginary);
	f = false;
	return c;	
}
}


