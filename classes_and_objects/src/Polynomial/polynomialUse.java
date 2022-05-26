package Polynomial;

public class polynomialUse {
public static void main(String[] args) {
polynomial p1 = new polynomial();
p1.setCoefficient(0,3);
p1.setCoefficient(2,2);
p1.print();

polynomial p2 = new polynomial();
p2.setCoefficient(0, 3);
p2.setCoefficient(2, 2);
p2.setCoefficient(1, 4);
p2.setCoefficient(2, 5);
p2.print();
// Adding p2 in p1
p1.add(p2);

polynomial p3 = new polynomial();
p3.setCoefficient(0, 5);
p3.setCoefficient(4, 10);
p3.setCoefficient(2, 3);
p1.subraction(p3);
p1.print();
p2.print();
}
}