package Polynomial;

public class polynomial {
private int coefficient[] ;
public polynomial() {
	coefficient = new int [5];

}
// this is working as getter and setter 
//public int setgetCoefficient(int deg,int coeff) {
//	if(deg > coefficient.length) {
//		int temp[] = coefficient;
//		coefficient = new int [2*coefficient.length];
//		for(int i =0 ; i < temp.length ; i++) {
//			coefficient[i] = temp[i];
//		}
//	return coefficient[deg] = coeff;
//	}
//	return coefficient[deg] = coeff; 
//}
public void setCoefficient(int deg,int coeff) {
	if(deg > coefficient.length) {
		int temp[] = coefficient;
		coefficient = new int [2*coefficient.length];
		for(int i =0 ; i < temp.length ; i++) {
			coefficient[i] = temp[i];
		}
	 coefficient[deg] = coeff;
	}
	 coefficient[deg] = coeff; 
}
public int getCoefficient(int deg) {
	if(deg < this.coefficient.length)
	return coefficient[deg];
	else return 0;
}
public void print() {
	for(int i =0 ; i < coefficient.length; i++ ) {
		if(coefficient[i] != 0) {
			System.out.print(coefficient[i]+"x^"+i+"+");
		}
	}
System.out.println();
}
public polynomial add(polynomial p) {
	polynomial ans = new polynomial();
	int l1 = this.coefficient.length;
	int l2 = p.coefficient.length;
	int min = Math.min(l1, l2);
	int i ;
	for(i = 0 ; i < min ; i++) {
		 ans.setCoefficient(i,this.coefficient[i]+p.coefficient[i]);
	}
	while ( i < l1) {
		ans.setCoefficient(i, this.coefficient[i]);
		i++;
	}
	while ( i < l2) {
		ans.setCoefficient(i, this.coefficient[i]);
	}
	return ans;
}
public polynomial subraction (polynomial p) {
	polynomial ans2 = new polynomial();
	int l1 = this.coefficient.length;
	int l2 = p.coefficient.length;
	int min = Math.min(l1, l2);
	int i ;
	for( i =0 ; i < min ; i++) {
		ans2.setCoefficient(i,this.coefficient[i]-p.coefficient[i]);
	}
	while(i < l1) {
		ans2.setCoefficient(i,this.coefficient[i]);
		i++;
	}
	while(i < l2) {
		ans2.setCoefficient(i,-p.coefficient[i]);
		i++;
	}
	return ans2;
}
public polynomial multiply (polynomial p) {
	polynomial ans3 = new polynomial();
	int l1 = this.coefficient.length;
	int l2 = p.coefficient.length;
	for(int i =0 ; i < l1 ; i++) {
		for(int j =0 ; j < l2 ; j++) {
			int termdeg = i+j;
			int termCoeff = this.coefficient[i]*p.coefficient[j];
			int oldCoeff = ans3.getCoefficient(termdeg);
			ans3.setCoefficient(termdeg,termCoeff+oldCoeff);
		}
	}
}


}