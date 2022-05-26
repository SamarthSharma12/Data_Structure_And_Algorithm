package Fraction_Class;
import java.util.*;
public class fraction_Use {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numerator for the first time");
int num1 = sc.nextInt();
System.out.println("Enter the denomenator for the first time");
int den1 = sc.nextInt();
fraction f1 = new fraction(num1,den1);
f1.print();

System.out.println();

 f1.setNumerator(20);
 int n1 = f1.getNumerator();
 System.out.println(n1);
 f1.print();

 System.out.println();

System.out.println("Enter the numerator for the second time");
 int num2 = sc.nextInt();
 System.out.println("Enter the denomenator for the second time");
 int den2 = sc.nextInt();
fraction f2 = new fraction(45,3);
f2.print();
f1.add(f2);
f1.print();

System.out.println();

System.out.println("Enter the numerator for the third time");
int num3 = sc.nextInt();
System.out.println("Enter the denomenator for the third time");
int den3 = sc.nextInt();
fraction f3 = new fraction(num3,den3);
System.out.println("Before the operation");
f3.print();
f3.multiply(f2);
System.out.println("After the operation");
f3.print();
f2.print();

fraction f4 = fraction.add(f1, f2);
f4.print();
f3.print();

}
}