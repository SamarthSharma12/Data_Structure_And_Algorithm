package ComplexNumber;

public class ComplexUse {
public static void main (String[] args) {
	Complex c1 = new Complex(2,3);	
	c1.print();
	c1.setReal(10);
	c1.setImaginary(30);
	c1.print();

	Complex c2 = new Complex(1,5);
	c1.add(c2);
	c1.print();
	c2.print();
	
	Complex c3 =  new Complex(3,2);
	c3.multiply(c2);
	c3.print();
	c2.print();
	
	Complex c4 = Complex.add(c1,c3);
	c1.print();
	c3.print();
	c4.print();
	
	Complex c5 = c1.conjugate();
	c5.print();
}
}
